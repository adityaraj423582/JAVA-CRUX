package Leetcode;

public class count_and_say {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = count(s);
        }
        return s;
    }

    public static String count(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
