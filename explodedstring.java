package week05;

public class explodedstring {
    public static String explode(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = "Baku";
        System.out.println(explode(input));
    }
}
