class Encapu

{
 private String name;
 private int age;
 private String college;
public void setName(String n)
{
 name=n;
}
public void setAge(int a)
{
 age=a;
}
public void setCollege(String c)
{
 college=c;
}

public String getName()
{
 return name;
}
public int getAge()
{
 return age;
}
public String getCollege()
{
 return college;
}
}
public class Encapus 
{
 public static void main(String[] args)
{
 Encapu obj=new Encapu();
 obj.setName("VARSHITHA REDDY");
 obj.setAge(18);
 obj.setCollege("Amrita Vishwa vidyapeetam");
 System.out.println("Name:"+obj.getName());
 System.out.println("Age:"+obj.getAge());
 System.out.println("College:"+obj.getCollege());
}
}