class Vashi{
  void vaski(){
    System.out.println("Hi this is first vashi");
  }
}

class Vashi2 extends Vashi{
  void vaski(){
    super.vaski();
    System.out.println("Hi this is second vashi");
  }
}

class keethu{
  public static void main(String[] args){
    Vashi obj = new Vashi2();
    obj.vaski();
  }
}