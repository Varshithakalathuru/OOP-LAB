interface Inters
{
 void varshi();
}

public class Inter implements Inters
{
  public void varshi()
 {
   System.out.println("This is varshi interference method");
 }
 public static void main(String[] args)
{
  Inter obj=new Inter();
  obj.varshi();
}
}