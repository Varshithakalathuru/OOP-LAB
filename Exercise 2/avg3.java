import java.util.Scanner;
public class avg3
{
 public static void main(String[] args)
 {
  int a,b,c,sum;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the 1st number:");
  a=s.nextInt();
  System.out.println("Enter the 2nd number:");
  b=s.nextInt();
  System.out.println("Enter the 3rd number:");
  c=s.nextInt();
  sum=a+b+c;
  double average=sum/3;
  System.out.println("The average of the number is average"+average);
 }
}