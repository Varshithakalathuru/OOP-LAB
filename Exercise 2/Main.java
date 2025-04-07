// Abstract class
abstract class Shape {
    abstract void draw(); // Abstract method
    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

// Subclass of Shape
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Subclass of Shape
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Using polymorphism
        Shape rectangle = new Rectangle();

        circle.draw();
        circle.display();

        rectangle.draw();
        rectangle.display();
    }
}
