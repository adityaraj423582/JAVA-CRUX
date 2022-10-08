package lecture3;
import java.util.*;
public class fun_anagrams {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        boolean isAnagram = true;
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq[ch - 'a']--;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
