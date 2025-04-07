class Test
{
 void a()
 {
   int a=20/0; 
 }
 void b()
 {
  a();
 }
 void c()
 {
  try 
  {
   b();
  }
  catch(Exception e)
  {
    System.out.println("Somthing went wrong"+e);
  }
 }
}
class Test1
{
public static void main(String[] args)
{
 Test obj=new Test();
 obj.c();
 System.out.println("verified plz");
}
}