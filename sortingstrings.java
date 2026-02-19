package week05;

import java.util.Arrays;

public class sortingstrings {
    public static String sortString(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
    
    public static void main(String[] args) {
        String input = "ukBa";
        System.out.println(sortString(input));
    }
}
