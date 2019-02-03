package lk.fs.mihira.dto;

public class FruitItemDTO {

    private Integer item_code;
    private String fruit_name;
    private Double unit_price;
    private Integer qty_on_hand;
    private Integer su_id;
    private SupplierDTO supplierDTO;

    public FruitItemDTO() {
    }


    public FruitItemDTO(Integer item_code, String fruit_name, Double unit_price, Integer qty_on_hand, Integer su_id) {
        this.item_code = item_code;
        this.fruit_name = fruit_name;
        this.unit_price = unit_price;
        this.qty_on_hand = qty_on_hand;
        this.su_id=su_id;
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


	public Integer getSu_id() {
		return su_id;
	}


	public void setSu_id(Integer su_id) {
		this.su_id = su_id;
	}


	public SupplierDTO getSupplierDTO() {
		return supplierDTO;
	}


	public void setSupplierDTO(SupplierDTO supplierDTO) {
		this.supplierDTO = supplierDTO;
	}


	@Override
	public String toString() {
		return "FruitItemDTO [item_code=" + item_code + ", fruit_name=" + fruit_name + ", unit_price=" + unit_price
				+ ", qty_on_hand=" + qty_on_hand + ", su_id=" + su_id + "]";
	}


	
}
