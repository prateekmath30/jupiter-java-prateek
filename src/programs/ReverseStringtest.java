package programs;

public class ReverseStringtest {

    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
