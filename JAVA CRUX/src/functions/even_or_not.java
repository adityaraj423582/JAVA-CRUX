package functions;
import java.util.*;
public class even_or_not {


    public static int evenOrNot(int n) {
        if (n % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = evenOrNot(n);
        if (ans == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}