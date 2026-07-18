import java.util.Optional;

class Employee {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

class InvalidEmployeeException extends RuntimeException {

    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class P3 {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            System.out.println(employee);

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}