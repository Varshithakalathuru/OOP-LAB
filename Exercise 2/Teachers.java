class Teacher {
    String name;

    void teach() {
        System.out.println(name + " teaches.");
    }
}

class MathTeacher extends Teacher 
{ 
    void subject()
    {
        System.out.println(name + " teaches Mathematics.");
    }
}

public class Teachers {
    public static void main(String[] args) {
        MathTeacher obj = new MathTeacher();
        obj.name = "Mr. Raj";
        obj.teach();    
        obj.subject();  
    }
}