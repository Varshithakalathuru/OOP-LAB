class Vehicle
{
  String model;
  String make;
  void start()
  {
   System.out.println("starting");
  }
  void stop()
  {
   System.out.println("stoping");
  } 
}
class Car extends Vehicle
{
 void drive()
 {
  System.out.println("driving");
 }
 public static void main(String[] args)
 {
  Car obj=new Car();
  obj.make="toyato";
  obj.model="toya";
  obj.start();
  obj.stop();
  obj.drive();
  System.out.println("make:"+obj.model);
  System.out.println("model:"+obj.make);
 }
}