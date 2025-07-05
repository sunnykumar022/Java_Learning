import java.util.*;;
public class PrintTable {
    public static void main (String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i= 0; i<= 10; i++){
            System.out.printf("\n%d * %d = " + num * i ,num,i );
        }

    }
}
