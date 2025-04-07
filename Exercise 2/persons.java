 class person
{
 private String name;
 private int age;
  
 public String getName()
 {
   return name;
 }
 public void setName(String name)
 {
   this.name=name;
 }
 
 public int getAge()
 {
   return age;
 }
 public void setAge(int age)
 {
   this.age=age;
 }
}

class persons extends person
{
 public static void main(String[] args)
 {
  persons obj=new persons();
  obj.setName("Varshitha_Reddy");
  obj.setAge(18);
  System.out.println("Name:"+obj.getName());
  System.out.println("Age:"+obj.getAge());
 }
}