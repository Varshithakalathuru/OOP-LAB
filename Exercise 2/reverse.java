
import java.util.Scanner;
public class reverse
{
  public static void main(String[] args)
  {
    int n ;
    int m ,reverse=0;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number:");
    n=s.nextInt();
    while(n>0)
    {
      m=n%10;
      reverse=reverse*10+m;
      n=n/10;
    }
      System.out.println("The reverse  is"+reverse);
    }
}
