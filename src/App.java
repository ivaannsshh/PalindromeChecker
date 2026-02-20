import java.util.Scanner;
import java.util.Stack;

public class App {
    public static boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;   // Not a palindrome
            }
        }
        return true;    // It is a palindrome
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Palindrome Checker App - UC5 (Stack Based) =====");
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
