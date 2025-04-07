class life
{
  void marks()
  {
    System.out.println("read book u will get marks");
  }
  void knowledge()
  {
    System.out.println("read books and gain knowledge");
  }
}
class Varshi7 extends life
{
    public static void main(String[] args)
    {
        life obj=new life();
        obj.marks();
        obj.knowledge();
    }
}