 class Singles
{
 void varshi()
 {
  System.out.println("This is varshi method Single inheritance");
 }
}
class Singluuu extends Singles
{
 void nannaamma()
 {
  System.out.println("They are my world");
 }
 void love()
 {
  System.out.println("I love u nanna ammma anna");
 }
}

 class Single extends Singluuu
{
 void umesh()
 {
   System.out.println("This is umesh method Single inheritance");
 }
 public static void main(String[] args)
 {
  Single obj=new Single();
  obj.varshi();
  obj.umesh();
  obj.nannaamma();
  obj.love();
 }
}