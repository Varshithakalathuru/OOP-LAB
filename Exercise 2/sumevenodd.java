import java.util.Scanner;
public class sumevenodd
{
 public static void main(String[] args)
{
 int n,sumE=0,sumO=0;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number of elements in the arrey:");
 n=s.nextInt();
int[] a=new int[n];
System.out.println("Enter the elements of the arrey:");
for(int i=0;i<n;i++)
{
 a[i]=s.nextInt();
}
 for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
{ 
  sumE=sumE+a[i];
}
else
{
 sumO=sumO+a[i];
}
}
System.out.println(+sumE);
System.out.println(+sumO);
}
}