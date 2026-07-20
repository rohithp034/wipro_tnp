import java.util.*;

class Employee {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobileNumber,
                    String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            list.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(list, Comparator.comparing(Employee::getFirstName));

        System.out.println("\nEmployee List:\n");

        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : list) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}