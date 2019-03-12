import java.util.Scanner;
public class Addpgm{
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st: ");
        a=s.nextInt();
        System.out.println("Enter 2nd: ");
        b=s.nextInt();
        System.out.println("sum="+(a+b));
    }
}