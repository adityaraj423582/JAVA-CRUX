package lecture3;
import java.util.*;
public class input {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }
    }
}
