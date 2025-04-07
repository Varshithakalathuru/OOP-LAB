import java.util.Scanner;
class Room {
    double length;
    double width;

     double area() {
        return length * width;
    }
}
class RoomVolume extends Room {
    double height;

      double volume() {
        return length * width * height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the length of the room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the room: ");
        double height = scanner.nextDouble();

        RoomVolume myRoom = new RoomVolume();
        myRoom.length = length;
        myRoom.width = width;
        myRoom.height = height;

                System.out.println("Area of the room: " + myRoom.area() + " square units");

                System.out.println("Volume of the room: " + myRoom.volume() + " cubic units");

            }
}
