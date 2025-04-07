imporrt java.util.Scanner;
class pay
{
 void getsalary()
 {
   System.out.println("Salary is:"+t);
 }
 void gettotalamount()
 {
   System.out.println("atotal amount that we get is:"+h);
 }
}
class bill extends pay
 public static void main(String[] args)
 {
   int t,h;
   Scanner s=new Scanner(System.in);
   bill obj=new bill();
   System.out.println("Enter the salary");
   obj.t=s.nextInt();
   System.out.println("Enter the total salaray after the gst:");
   obj.h=s.nextInt();
   obj.getsalary();
   obj.gettotalamount();
   
 }
}