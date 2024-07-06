import java.util.Scanner;

public class IfElseChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem 1: Even or Odd
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        // Problem 2: Grade Calculator
        System.out.print("Enter a score (0-100): ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Problem 3: Leap Year Checker
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Problem 4: Maximum of Three
        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Maximum: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Maximum: " + num2);
        } else {
            System.out.println("Maximum: " + num3);
        }

        // Problem 5: Vowel or Consonant
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}
