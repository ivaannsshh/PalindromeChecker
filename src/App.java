import java.util.Scanner;

public class App {
      public static boolean checkPalindrome(String input) {

        // Convert String to char array
        char[] charArray = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = charArray.length - 1;

        // Compare characters using two-pointer technique
        while (start < end) {

            if (charArray[start] != charArray[end]) {
                return false;   // Not a palindrome
            }

            start++;
            end--;
        }

        return true;    // It is a palindrome
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App - UC4 =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

    
    
        scanner.close();
    }
}
