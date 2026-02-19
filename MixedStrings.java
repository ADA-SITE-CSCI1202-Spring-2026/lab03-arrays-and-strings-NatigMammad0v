package week05;

public class MixedStrings {
    public static String swapWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                
                String middle = word.substring(1, word.length() - 1);
                word = last + middle + first;
            }
            
            result.append(word);
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        System.out.println(swapWords(input));
    }
}
