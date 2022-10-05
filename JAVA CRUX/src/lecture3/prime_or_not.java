package lecture3;

public class prime_or_not {
    public static void main(String[] args) {
        int n = 7;
        int d = 2;
       for(int i = 2; i < n; i++) {
           if(n % i == 0) {
               System.out.println("Not Prime");
               return;

           }
       }
    }
}

