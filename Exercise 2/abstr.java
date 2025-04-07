abstract class abst
{
 abstract void varshi();
 public void anna()
 {
  System.out.println("Anna is my best friend");
 }
 
}
public  class abstr extends abst
{
 public void varshi()
 {
  System.out.println("I am the varshi sister of anna");
 }
public static void main(String[] args)
{
  abstr obj = new abstr();
  obj.anna();
  obj.varshi();
}
}