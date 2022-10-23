package lecture6;
import java.util.Scanner;
public class function {


    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
            printMyName(name);




    }
}
