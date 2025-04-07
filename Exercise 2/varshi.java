public class varshi
{
 public static void main(String[] arg)
{
 int a=10,b=0;
 try
{

 if(b==0)
  throw new ArithmeticException("I can do this");
  int c=a/b;
 System.out.println(c);
}
catch(Exception e)
{
 System.out.println("Bye"+e);
}
finally
{
 System.out.println("I have completed try,catch");
}
}
}