import java.util.Scanner;

public class CheckPalindromeNumber {

    public static boolean isNumberPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int extractedValue = number % 10;
            reversedNumber = reversedNumber * 10 + extractedValue;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();
        
        if (isNumberPalindrome(number)) {
            System.out.print(number + " is a palindrome");
        } else {
            System.out.print(number + " is not a palindrome");
        }
        
        
    }
}
