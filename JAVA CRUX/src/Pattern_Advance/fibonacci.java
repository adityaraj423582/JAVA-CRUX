package Pattern_Advance;

import java.util.Scanner;
public class fibonacci {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int  a = 0;
       int b = 1;
       for (int i = 1; i <= n; i++ ) {
           int c= a+b;
           a=b;
           b=c;
              System.out.println(a);





       }
    }
}
