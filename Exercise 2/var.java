import java.util.Scanner;
public class var
{
 public static void main(String [] args)
{
 String name;
 int age;
 double salary;
 Scanner obj=new Scanner(System.in);
 name=obj.nextLine();
 age=obj.nextInt();
 salary=obj.nextDouble();
 System.out.println("Enter the name,age and salary:");
 System.out.println("Name:"+name);
 System.out.println("age:"+age);
 System.out.println("salary:"+salary);
}
}