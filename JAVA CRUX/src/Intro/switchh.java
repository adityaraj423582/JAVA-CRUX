package Intro;
 import java.util.*;

public class switchh {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("hola");
                break;
            default:
                System.out.println("invalid button");
                break;

        }
    }
    }
