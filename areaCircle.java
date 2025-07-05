import java.util.*;
public class areaCircle{
    public static void main(String[] args){
        System.out.println("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        System.out.println("Area of the circle : " + 3.14 * rad * rad);

    }
}