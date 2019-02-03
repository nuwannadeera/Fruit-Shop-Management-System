package lk.fs.mihira.dto;

public class OrderDetailDTO {

    private Integer od_id;
    private Integer item_code;
    private Integer qty;
    private Double unit_price;
    private Double amount;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(Integer od_id, Integer item_code, Integer qty, Double unit_price, Double amount) {
        this.od_id = od_id;
        this.item_code = item_code;
        this.qty = qty;
        this.unit_price = unit_price;
        this.amount = amount;
    }

    public OrderDetailDTO(Integer item_code, Integer qty, Double unit_price, Double amount) {
        this.item_code = item_code;
        this.qty = qty;
        this.unit_price = unit_price;
        this.amount = amount;
    }

    
    public Integer getOd_id() {
		return od_id;
	}

	public void setOd_id(Integer od_id) {
		this.od_id = od_id;
	}

	public Integer getItem_code() {
		return item_code;
	}

	public void setItem_code(Integer item_code) {
		this.item_code = item_code;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderDetailDTO [od_id=" + od_id + ", item_code=" + item_code + ", qty=" + qty + ", unit_price="
				+ unit_price + ", amount=" + amount + "]";
	}

}
