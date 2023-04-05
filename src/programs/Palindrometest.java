package programs;

public class Palindrometest {

    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
    public static boolean checkPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
