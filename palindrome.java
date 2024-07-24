import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Use nextLine() to read the entire input including spaces
       // Close the scanner after use

        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
