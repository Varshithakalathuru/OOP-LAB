import java.util.Scanner;
class slip
{
 String name;
 String role;
int bonus;
int salary;
int total;
 
 void manager()
 {
   System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary: " + salary);
        System.out.println("Total salary: " + total);
 }
}
class slips extends slip
{
 public static void main(String[] args)
{
 Scanner s= new Scanner(System.in);
 slip obj=new slip();

 System.out.println("Enter the name:");
 obj.name=s.nextLine();

 System.out.println("Enter the role:");
obj. role=s.nextLine();

 System.out.println("Enter the bonus:");
 obj. bonus=s.nextInt();

 System.out.println("Enter the salary:");
 obj. salary=s.nextInt();

 obj.total=obj.bonus+obj.salary;
 obj.manager();
}
}
