import java.util.Scanner;

public class App {

    // Method to check palindrome after normalization
    public static boolean checkPalindrome(String input) {

        // Step 1: Normalize string
        // Remove all spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Two pointer logic
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a PALINDROME ✅");
        } else {
            System.out.println("Result: The string is NOT a palindrome ❌");
        }

        sc.close();
    }
}