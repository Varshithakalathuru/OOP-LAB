class Hillstations {
    void location() {
        System.out.println("Location is: ");
    }

    void famousfor() {
        System.out.println("Famous for: ");
    }
}

// Subclass Manali
class Manali extends Hillstations {
    void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }

    void famousfor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports.");
    }
}

// Subclass Mussoorie
class Mussoorie extends Hillstations {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    void famousfor() {
        System.out.println("It is Famous for Kempty Falls and beautiful views.");
    }
}

// Subclass Gulmarg
class Gulmarg extends Hillstations {
    void location() {
        System.out.println("Gulmarg is in Jammu and Kashmir.");
    }

    void famousfor() {
        System.out.println("It is Famous for skiing and the Gulmarg Gondola.");
    }
}

// Main class
public class HillstationDemo {
    public static void main(String[] args) {
        Hillstations hill1 = new Manali();
        Hillstations hill2 = new Mussoorie();
        Hillstations hill3 = new Gulmarg();

        System.out.println("Manali Details:");
        hill1.location();
        hill1.famousfor();

        System.out.println("\nMussoorie Details:");
        hill2.location();
        hill2.famousfor();

        System.out.println("\nGulmarg Details:");
        hill3.location();
        hill3.famousfor();
    }
}
