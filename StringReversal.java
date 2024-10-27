public class StringReversal {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello, Java!";
        System.out.println("Reversed string: " + reverseString(input));
    }
}
