package lk.fs.mihira.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "FruitItem")
public class FruitItem implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name="ITEM_CODE",nullable=false,length=20)
    private Integer item_code;
    
    @Column(name="FRUIT_NAME",nullable=false,length=50)
    private String fruit_name;
    
    @Column(name="UNIT_PRICE",nullable=false,length=10)
    private Double unit_price;
    
    @Column(name="QTY_ON_HAND",nullable=false,length=10)
    private Integer qty_on_hand;

    
    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "SU_ID", referencedColumnName = "SU_ID")
    private Supplier supplier;

    @OneToMany(mappedBy = "fruititem",cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public FruitItem() {
    }

    public FruitItem(Integer item_code, String fruit_name, Double unit_price, Integer qty_on_hand, Supplier supplier) {
        this.item_code=item_code;
        this.fruit_name = fruit_name;
        this.unit_price = unit_price;
        this.qty_on_hand = qty_on_hand;
        this.supplier = supplier;
    }



    
    public Integer getItem_code() {
		return item_code;
	}

	public void setItem_code(Integer item_code) {
		this.item_code = item_code;
	}

	public String getFruit_name() {
		return fruit_name;
	}

	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}

	public Double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}

	public Integer getQty_on_hand() {
		return qty_on_hand;
	}

	public void setQty_on_hand(Integer qty_on_hand) {
		this.qty_on_hand = qty_on_hand;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "FruitItem [item_code=" + item_code + ", fruit_name=" + fruit_name + ", unit_price=" + unit_price
				+ ", qty_on_hand=" + qty_on_hand + "]";
	}

	
}
