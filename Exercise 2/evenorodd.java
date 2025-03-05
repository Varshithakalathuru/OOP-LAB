import java.util.Scanner;
public class evenorodd
{
 public static void main(String[] args)

{
 int n;
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the number:");

 n=s.nextInt();
  if(n%2==0)
{
 System.out.println("is even number");
}
else
{
 System.out.println("is odd number");
}
}
}