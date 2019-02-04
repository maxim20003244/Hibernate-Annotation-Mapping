package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firsNAme;

    @Column(name = "LAST_NAME")
    private String lastNAme;

    @Column(name="BIRTHDAY")
    private Date birthday;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name="EMPL_PROJ",
            joinColumns = @JoinColumn(name="EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID")
    )

    private Set<Project> projects;

    public Employee (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsNAme() {
        return firsNAme;
    }

    public void setFirsNAme(String firsNAme) {
        this.firsNAme = firsNAme;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firsNAme='" + firsNAme + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address=" + address +
                ", projects=" + projects +
                '}';
    }
}
