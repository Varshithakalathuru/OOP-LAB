import java.util.Scanner;
public class palindrome
{
 public static void main(String[] args)
 {
  int n,m,reverse=0,a;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter a number:");
  n=s.nextInt();
  m=n;
  while(n>0)
  {
   a=n%10;
   reverse=reverse*10+a;
   n=n/10;
  }
 if(reverse==m)
  {
   System.out.println("Number is palindrome");
  }
 else
  {
  System.out.println("Number is not a palindrome");
  }
 }
}