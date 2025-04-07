import java.util.Scanner;
class Person {
    String name;
    int age;
    void personDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    String designation;
    double salary;
    void employeeDetails() {
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
public class Persons_job {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee obj = new Employee();
        System.out.print("Enter name: ");
        obj.name = scanner.nextLine();

        System.out.print("Enter age: ");
        obj.age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter designation: ");
        obj.designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        obj.salary = scanner.nextDouble();
        System.out.println("\n--- Person Details ---");
        obj.personDetails();
        System.out.println("\n--- Employee Details ---");
        obj.employeeDetails();
    }
}