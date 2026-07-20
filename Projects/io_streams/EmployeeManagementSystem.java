import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void addEmployee(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("employee.txt", true);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + " " + name + " " + age + " " + salary + "\n");
            fw.close();

            System.out.println("Employee Added Successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }
    }

    public static void displayAll() {
        try {
            File file = new File("employee.txt");

            if (!file.exists()) {
                System.out.println("No employee records found.");
                return;
            }

            Scanner fileReader = new Scanner(file);

            System.out.println("-----Report-----");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            System.out.println("-----End of Report-----");

            fileReader.close();

        } catch (Exception e) {
            System.out.println("Error while reading file.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayAll();
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}