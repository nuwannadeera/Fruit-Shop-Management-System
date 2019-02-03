package lk.fs.mihira.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Supplier")
public class Supplier implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    
    @Column(name="SU_ID",nullable=false,length=20)
    private Integer su_id;
    
    @Column(name="NAME",nullable=false,length=50)
    private String name;
    
    @Column(name="ADDRESS",nullable=false,length=60)
    private String address;
    
    @Column(name="CONTACT_NO",nullable=false,length=20)
    private String contact_no;

    
    @OneToMany(mappedBy = "supplier", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<FruitItem> fruitItem = new ArrayList<>(); // uses a list as many fruit items for one supplier

    public Supplier() {
    }

    public Supplier(String name, String address, String contact_no) {
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
    }

    public Supplier(Integer suid,String name, String address, String contact_no) {
        this.su_id=suid;
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
		return "Supplier [su_id=" + su_id + ", name=" + name + ", address=" + address + ", contact_no=" + contact_no
				+ "]";
	}

	
}
