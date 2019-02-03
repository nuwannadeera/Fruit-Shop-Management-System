package lk.fs.mihira.dto;

public class CustomerDTO {

    private Integer cid;
    private String name;
    private String address;
    private String contact_no;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer cid, String name, String address, String contact_no) {
        this.cid = cid;
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
    }

    public CustomerDTO(String name, String address, String contact_no) {
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

	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", name=" + name + ", address=" + address + ", contact_no=" + contact_no
				+ "]";
	}
    
}
