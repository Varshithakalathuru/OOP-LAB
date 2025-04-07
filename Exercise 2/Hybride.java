class Parent 
{
    void displayParent() 
    {
      System.out.println("This is the parent class.");
    }
}
interface InterfaceA 
{
    void methodA(); 
}
interface InterfaceB {
    void methodB();
}
class Child extends Parent implements InterfaceA, InterfaceB {
  void methodA() 
    {
        System.out.println("This is methodA from InterfaceA.");
    }
   void methodB() {
        System.out.println("This is methodB from InterfaceB.");
    }
    void displayChild() {
        System.out.println("This is the child class.");
    }
}
public class Hybride
   {
     public static void main(String[] args) 
      {
        Child obj = new Child();
        obj.displayParent(); 
        obj.methodA();       
        obj.methodB();            
        obj.displayChild();      }
}