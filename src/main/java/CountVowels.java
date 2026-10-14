public class CountVowels {
    public static int countVowels(String input) {
        if (input == null) throw new IllegalArgumentException("Input must not be null");
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Number of vowels = " + countVowels(text));
    }
}
