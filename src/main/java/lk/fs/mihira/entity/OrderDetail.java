package lk.fs.mihira.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "OrderDetail")
public class OrderDetail implements Serializable {

    @Id
    @Column(name = "OD_ID",nullable=false,length=20)
    private int od_id;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "OID", referencedColumnName = "OID")
    private Orders orders;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_CODE", referencedColumnName = "ITEM_CODE")
    private FruitItem fruititem;

    @Column(name = "qty",nullable=false,length=20)
    private double qty;

    @Column(name = "amount",nullable=false,length=20)
    private double amount;


    public OrderDetail() {
    }

    public OrderDetail(int od_id, double qty) {
        this.od_id = od_id;
        this.qty = qty;
    }
    
    public OrderDetail(int od_id, Orders orders, FruitItem fruititem, double qty, double amount) {
    	super();
    	this.od_id = od_id;
    	this.orders = orders;
    	this.fruititem = fruititem;
    	this.qty = qty;
    	this.amount = amount;
    }

    
	public int getOd_id() {
		return od_id;
	}

	public void setOd_id(int od_id) {
		this.od_id = od_id;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public FruitItem getFruititem() {
		return fruititem;
	}

	public void setFruititem(FruitItem fruititem) {
		this.fruititem = fruititem;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
