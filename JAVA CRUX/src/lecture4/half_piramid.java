package lecture4;
import java.util.*;
public class half_piramid {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
