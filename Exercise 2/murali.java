import java.util.Scanner;
abstract class umesh
{
 abstract void Clg();
 abstract void Age();
 String nam;
 String clg;
  int age;
 void anna()
 {
  System.out.println("Name:"+nam);
 }
}

public class murali extends umesh
{
 void Clg()
 {
  System.out.println("college:"+clg);
 }
 void Age()
 {
  System.out.println("Age:"+age);
 }
public static void main(String[] args)
{ 
  Scanner s= new Scanner(System.in);
  murali obj=new murali();
  System.out.println("Enter the name:");
  obj.nam=s.nextLine();
  System.out.println("Enter the collage name:");
  obj.clg=s.nextLine();
  System.out.println("Enter the age:");
  obj.age=s.nextInt();
  obj.anna();
  obj.Clg();
  obj.Age();
}
}