class A{
    public void car(){
        System.out.println("Audi car");

    }
}
class B extends A{
 public void bike(){
     System.out.println("duke bike");
 }
}
public class Inheritance{


public static void main(String[] args) {
  B ob=new B();
  ob.car();  
}
}