class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals walk on land.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dogs bark.");
    }
}

public class MultilevelInheritanceExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  
        dog.walk();       
        dog.bark();  
   }
}