package lk.fs.mihira.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Orders implements Serializable {

    @Id    
    @Column(name="OID",nullable=false,length=20)
    private int oid ;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "CID", referencedColumnName = "CID")
    private Customer customer;

    @Column(name = "DATE",nullable=false,length=20)
    private String date;

    @OneToMany(mappedBy = "orders",cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails = new ArrayList<>(); // uses a list as many orders for one customer



    public Orders(int oid, Customer customer, String date) {
        this.oid = oid;
        this.customer = customer;
        this.date = date;
    }

    public Orders(int oid, Customer customer, String date, List<OrderDetail> orderDetails) {
        this.oid = oid;
        this.customer = customer;
        this.date = date;
        this.orderDetails = orderDetails;
    }

    public Orders() {
    }


    public Orders(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Orders(int oid, String date) {
        this.oid = oid;
        this.date = date;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
