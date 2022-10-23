package lecture6;

public class print_n_number {
    public static void printN(int n) {
        if (n == 0) {
            return;
        }
        printN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printN(n);
    }
}

