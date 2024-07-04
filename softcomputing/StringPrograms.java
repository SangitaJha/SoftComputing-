public class StringPrograms {
    public static void main(String[] args) {
        String str = "Sangita";
        System.out.println(reverse(str));
    }

    public static String reverse(String in) {
        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            System.out.print(chars[i] + " ");
        return in;
    }
}