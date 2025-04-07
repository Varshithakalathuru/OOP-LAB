import java.util.Scanner;
class Room
{
   int area,volume; 
  void getarea()
  {
    System.out.println("The area of the room is:"+area);
  }
  void getvolume()
 {
            System.out.println("The volume of the room is:"+volume);
 }
}

class areavolume extends Room
{
public static void main(String[] args)
    {
      int l,b,h;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the length:");
      l=s.nextInt();

      System.out.println("Enter the breadth:");
      b=s.nextInt();

      System.out.println("Enter the height:");
      h=s.nextInt();
      
      areavolume obj=new areavolume();
      obj.area=l*b;
      obj.volume=l*b*h;
      obj.getarea();
      obj.getvolume();
    }
}