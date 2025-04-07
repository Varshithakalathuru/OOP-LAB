import java.util.Scanner;
public class norp
{
 public static void main(String[] args)
 {
  int a;int b;int c;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the 1st number:");
  a=s.nextInt();
  System.out.println("Enter the 2nd number:");
  b=s.nextInt();
  System.out.println("Enter the 3rd number:");
  c=s.nextInt();
  if (a>b && a>c)
  {
   System.out.println(a+"is the largest number");
  }
  else if(b>a && b>c)
  {
   System.out.println(b+"is the largest number");
  }
  else
  {
   System.out.println(c+"is the largest number");
  }
 }
}