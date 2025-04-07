import java.util.Scanner;
public class Practice
{
 public static void main(String[] args)
{
 int n;
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the number:");
 n=s.nextInt();
 switch(n)
 {
  case 1:
         System.out.println("Today is Monday");
         break;
  case 2:
        System.out.println("Today is tuesday");
        break;
  case 3:
        System.out.println("Today is wednesday");
        break;
  case 4:
        System.out.println("Tody is Thursday");
        break;
  case 5:
        System.out.println("Today is Friday");
        break;
  case 6:
        System.out.println("Today is Saturday");
        break;
  case 7:
        System.out.println("Today is sunday");
        break;
  default:
        System.out.println("Invalid days");
        break;
 }
}
}