package Java_Basics;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Kindly enter your number");
            String input = scanner.nextLine();
            boolean isPalindrome = isPalindrome(input);
            if (isPalindrome) {
                System.out.println("\"" + input + "is a Palindrome");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome.");
            }
        }

        }
        public static boolean isPalindrome (String str){
            String reversedStr = new StringBuilder(str).reverse().toString();
            return str.equals(reversedStr);
        }

    }
