package lecture6;
import java.util.*;
public class prime_or_not {
    public static int primeOrNot(int n) {
        int i = 2;
        for (i = 2; i <= n; i++) {
            return 0;


        }
        return 1;

    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = primeOrNot(n);
            if (ans == 1) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }

