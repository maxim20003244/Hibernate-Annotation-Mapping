package entity;


import javax.persistence.*;

@Entity
@Table(name="ADDRESS")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "COUNTRY")
    private String coutnry;

    @Column(name="CITY")
    private String city;

    @Column(name = "STREET")
    private  String street;

    @Column(name = "POST_CODE",length = 10)
    private String post_code;

    public Address(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoutnry() {
        return coutnry;
    }

    public void setCoutnry(String coutnry) {
        this.coutnry = coutnry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", coutnry='" + coutnry + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", post_code='" + post_code + '\'' +
                '}';
    }
}
