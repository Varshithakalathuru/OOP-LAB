public class emp
{
 String name;
 int id;
 int age;

 public void setname(String name)
 {
  this.name=name;
 }
 public void setid(int id)
 {
  this.id=id;
 }
 public void setage(int age)
 {
  this.age=age;
 }
 public String getname()
 {
  return name;
 }
 public int getid()
 {
  return id;
 }
 public int getage()
 {
  return age;
 } 
}

public class employe
{
 public static void main(String[] args)
 {
  emp obj=new emp();
  obj.setname("varshitha");
  obj.setid(24020);
  obj.setage(18);
  
 System.out.println("name:"+obj.getname());
 System.out.println("id:"+obj.getid());
 System.out.println("age:"+obj.getage());
 }
}




