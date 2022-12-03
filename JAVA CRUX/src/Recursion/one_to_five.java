package Recursion;

public class one_to_five {
    public static void PrintNumbers(int n){
        if (n == 5) {
            return;
        }
        System.out.println(n);
        PrintNumbers(n+1);              // recursive call
    }
    public static void main(String args[]){
        int n =1;
        PrintNumbers(n);       // function call
    }
}

