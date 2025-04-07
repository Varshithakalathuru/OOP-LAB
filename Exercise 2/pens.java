
abstract class pen
{
 abstract void write();
 abstract void refill();

void object()
{
 System.out.println("This is pen");
}
} 

class pens extends pen
{
 void write()
 {
  System.out.println("this is write abstract method");
 }
 void refill()
 {
  System.out.println("this is refill abstract method");
 }
public static void main(String[] args)
{
 pens obj=new pens();
 obj.object();
 obj.write();
 obj.refill();
}
}