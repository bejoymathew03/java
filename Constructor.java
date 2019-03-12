public class Constructor{
    int x;
   Constructor(){
       System.out.println("constructor called");
       x=100;
   }
   public static void main(String[] args) {
       Constructor c=new Constructor();
       System.out.println(c.x);
   }
}