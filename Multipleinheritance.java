interface Parent1{
    default void car(){
        System.out.println("audi car");
    }
}
interface Parent2{
    default void car(){
        System.out.println("bmw car");
    }
}
public class Multipleinheritance implements Parent1,Parent2{
    public void car(){
        Parent1.super.car();
    }

public static void main(String[] args) {
    Multipleinheritance d=new Multipleinheritance();
    d.car();
}}