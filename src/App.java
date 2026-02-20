import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palindrome Checker App (UC3) ===");
        System.out.print("Enter a string to check: ");
        String originalString = scanner.nextLine();
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        if (originalString.equals(reversedString)) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }
        scanner.close();
    }
}


