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
   return age;
  }

 public static void main(String[] args)
 {
  varshis obj =new varshis();
  System.out.println("Name:"+obj.Name("VARSHITHA Reddy"));
  System.out.println("Age:"+obj.Age(18));
 }
}