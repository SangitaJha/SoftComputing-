public class StringContainsVowels {
    public static void main(String[] args) {
        String str = "Hello World!"; // String to be checked for vowels
        int count = 0; // Variable to store the count of vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Getting the character at the current index
            if (ch == 'a' || ch == 'e' || ch == 'i') {
                count++; // Incrementing the count if the character is a vowel
            }
        }
        System.out.println("The number of vowels in the string is: " + count);
    }
}
