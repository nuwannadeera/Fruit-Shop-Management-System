package lk.fs.mihira.dto;

public class OrdersDTO {

    private Integer oid;
    private Integer cid;
    private String date;
    private CustomerDTO customerDTO;

    public OrdersDTO() {
    }

    public OrdersDTO(Integer oid, Integer cid, String date) {
        this.oid = oid;
        this.cid = cid;
        this.date = date;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "oid=" + oid +
                ", cid=" + cid +
                ", date='" + date + '\'' +
                '}';
    }
}
