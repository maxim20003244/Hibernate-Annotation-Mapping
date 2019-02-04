package domain;

import bl.HibernateUtil;
import entity.Address;
import entity.Employee;
import entity.Project;
import org.hibernate.Session;
import service.AddressService;
import service.EmployeeService;
import service.ProjectService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Domain {
    public static void main( String[] args ) throws SQLException {
     AddressService addressService = new AddressService();
        EmployeeService employeeService =new EmployeeService();
        ProjectService projectService = new ProjectService();


        Address address = new Address();
        address.setCoutnry("DC");
        address.setCity("Gotham City");
        address.setStreet("Arkham street 1");
        address.setPost_code("0987");

        Project project =new Project();
        project.setTitile("Gothman PD");

        Employee employee = new Employee();
        employee.setFirsNAme("James");
        employee.setLastNAme("Gordon");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1939, Calendar.MAY, 1);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<Project>();
        projects.add(project);
        employee.setProjects(projects);


      /*  addressService.add(address);
        employeeService.add(employee);
        projectService.add(project);*/

      Address a = addressService.getBuyId(1L);
        System.out.println(a);

        HibernateUtil.shutdown();
    }

}
