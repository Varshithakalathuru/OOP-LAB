abstract class amrita
{
 abstract void student();
 void admin()
 {
  System.out.println("This is admin method");
 }
 void lecturer()
 {
  System.out.println("This is lecturer method");
 }
}

public class amrita_clg extends amrita
{
  public void student()
  {
   System.out.println("This is student method");
  }
public static void main(String[] args)
{
 amrita_clg obj=new amrita_clg();
 obj.admin();
 obj.lecturer();
 obj.student();
}
}
