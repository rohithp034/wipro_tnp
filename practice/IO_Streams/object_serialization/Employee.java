import java.io.*;
import java.util.Date;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department,
                    String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Rohith",
                    new Date(),
                    "IT",
                    "Software Engineer",
                    75000.0
            );

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();

            System.out.println("Object Serialized Successfully.");

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) in.readObject();
            in.close();

            System.out.println("\nDeserialized Employee Details");
            System.out.println("Name: " + e.getName());
            System.out.println("Date of Birth: " + e.getDateOfBirth());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}