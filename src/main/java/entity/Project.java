package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="PROJECT")
public class Project {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TITLE")
    private String Titile;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitile() {
        return Titile;
    }

    public void setTitile(String titile) {
        Titile = titile;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", Titile='" + Titile + '\'' +
                ", employees=" + employees +
                '}';
    }
}
