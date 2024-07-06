import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {
        // **Problem 1: Check if a number is even or odd**
        int Integer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        Integer = scanner.nextInt();
        if (Integer % 2 == 0)
            System.out.println("Integer is Even");
        else
            System.out.println("Integer is Odd");

        // **Problem 2: Determine a student's grade based on their score**
        int studentScore;
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter Your Score: ");
        studentScore = scanner2.nextInt();
        if (studentScore >= 90 & studentScore <= 100){
            System.out.println("Your Grade is A");
        } else if (studentScore >= 80 & studentScore <= 89) {
            System.out.println("Your Grade is B");
        } else if (studentScore >= 70 & studentScore <= 79) {
            System.out.println("Your Grade is C");
        } else if (studentScore >= 60 & studentScore <= 69) {
            System.out.println("Your Grade is D");
        } else if (studentScore >= 0 & studentScore <= 59) {
            System.out.println("Your Grade is F");
        }else{
            System.out.println("Invalid Input");
        }

        // **Problem 3: Check if a character is a vowel or consonant**
        char character;
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter a Character :");
        character = scanner3.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o'|| character == 'u'){
            System.out.println("The Character is Vowel");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("The Character is Consonant");
        }else {
            System.out.println("You Entered an Invalid Alphabet");
        }

        // **Problem 4: Check if a number is positive, negative, or zero**
        int number ;
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        number = scanner4.nextInt();
        if(number > 0){
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else if (number == 0) {
            System.out.println("Number is Zero");
        }

        // **Problem 5: Check if a year is a leap year**
        double year;
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Enter a Year :");
        year = scanner5.nextDouble();
        if (year % 4 == 0 || year % 400 == 0 ){
            System.out.println("The Year is Leap");
        }else {
            System.out.println("The Year is Not Leap");
        }

        // **Problem 6: Compare two numbers**
        int numberOne;
        int numberTwo;
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Enter The First Number :");
        numberOne = scanner6.nextInt();
        System.out.print("Enter The Second Number :");
        numberTwo = scanner6.nextInt();
        if (numberOne > numberTwo){
            System.out.println("NumberOne is Greater");
        } else if (numberTwo > numberOne) {
            System.out.println("NumberTwo is Greater");
        } else if (numberTwo == numberOne) {
            System.out.println("Both Numbers are Equal");
        }

        // **Problem 7: Determine a person's age category**
        int age;
        Scanner scanner7 = new Scanner(System.in);
        System.out.print("Enter Your Age :");
        age = scanner7.nextInt();
        if (age >= 0 && age <= 12){
            System.out.println("You are Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an Adult");
        } else if (age >= 65) {
            System.out.println("You are a Senior");
        }else {
            System.out.println("Invalid Input");
        }

        // **Problem 8: Check if a number is divisible by 5 and 11**
        int Integer2;
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Enter an Integer :");
        Integer2 = scanner8.nextInt();
        if (Integer2 % 5 == 0 && Integer2 % 11 == 0){
        System.out.println("Integer is divisible by both 5 and 11");
                } else if (Integer % 5 == 0) {
                    System.out.println("Integer is divisible by 5");
                } else if (Integer % 11 == 0) {
                    System.out.println("Integer is divisible by 11 ");
                }else {
                    System.out.println("Integer is neither divisible by 11 nor by 5");
                }
                  //Problem 09 *Checking whether student is pass or fail*
       int StudentScore;
       Scanner scanners = new Scanner(System.in);
       System.out.print("Enter Your Score :");
       studentScore = scanner.nextInt();
       if (studentScore >= 50){
           System.out.println("Pass");
       }else {
           System.out.println("Fail");
       }
               //Problem 10 *Traffic Signal Checker*
       String color;
       String redColor = "Red";
       String yellowColor = "Yellow";
       String greenColor = "Green";
       Scanner scanners2 = new Scanner(System.in);
       System.out.println("Enter the color :");
       color = scanner.next();
       if (color.equals(redColor)){
           System.out.println("Stop");
       } else if (color.equals(yellowColor)) {
           System.out.println("Get Ready");
       } else if (color.equals(greenColor)) {
           System.out.println("Go");
       }
            }
        }
        