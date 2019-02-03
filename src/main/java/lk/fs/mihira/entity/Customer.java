package lk.fs.mihira.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name="CID",nullable=false,length=20)
    private Integer cid;
    
    @Column(name="NAME",nullable=false,length=50)
    private String name;
    
    @Column(name="ADDRESS",nullable=false,length=60)
    private String address;
    
    @Column(name="CONTACT_NO",nullable=false,length=20)
    private String contact_no;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Orders> orders = new ArrayList<>();// uses a list as many orders for one customer

    public Customer() {
    }

    public Customer(String name, String address, String contact_no) {
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
    }

    public Customer(Integer cid,String name, String address, String contact_no) {
        this.cid=cid;
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
    }

    

    public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + 
				", name=" + name + 
				", address=" + address + 
				", contact_no=" + contact_no+ 
				", orders=" + orders + "]";
	}
}



