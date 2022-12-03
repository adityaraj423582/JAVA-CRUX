package Recursion;

public class basic {

    public static void PrintNumbers(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PrintNumbers(n-1);              // recursive call
    }
    public static void main(String args[]){
        int n =5;
        PrintNumbers(n);       // function call
    }
}
