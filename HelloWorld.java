import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("Enter your name:");
        Scanner sc  = new Scanner(System.in); 
        String name = sc.next();
        System.out.println(name);
    }
}