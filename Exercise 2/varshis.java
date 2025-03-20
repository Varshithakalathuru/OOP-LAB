abstract class varshi
{
 abstract void Age(int age);
 String Name(String name)
 {
   return name;
 }
}

class varshis extends varshi
{
 void  Age(int age)
  {  
    System.out.println("Age:"+age);
  }

 public static void main(String[] args)
 {
  varshis obj =new varshis();
  System.out.println("Name:"+obj.Name("VARSHITHA Reddy"));
  obj.Age(18);
 }
}