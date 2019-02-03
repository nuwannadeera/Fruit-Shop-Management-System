package lk.fs.mihira.dto;

public class SupplierDTO {

    private Integer su_id;
    private String name;
    private String address;
    private String contact_no;

    public SupplierDTO() {
    }

    public SupplierDTO(Integer su_id, String name, String address, String contact_no) {
        this.su_id = su_id;
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
    }

    public SupplierDTO(String name, String address, String contact_no) {
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
    }

	public Integer getSu_id() {
		return su_id;
	}

	public void setSu_id(Integer su_id) {
		this.su_id = su_id;
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

	@Override
	public String toString() {
		return "SupplierDTO [su_id=" + su_id + ", name=" + name + ", address=" + address + ", contact_no=" + contact_no
				+ "]";
	}

    
}
