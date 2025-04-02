package IfElse;

// write the code for check the whether a charcater is alphabet or not

import java.util.Scanner;
//
//public class ifElse {

// import java.util.Scanner;
// public class newexamples{
//     public  static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your charcater :");
//         char character = scanner.next().charAt(0);

//         //condition check;

//         if((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
//                 System.out.println(character +"give value is charcater :");
//         }

//         else{
//             System.out.println(character+ "given is not a character :");
//         }

//         scanner.close();
//     }
// }

//write the code forto check any input is an aplhabet and check whether it is vowel or constant;
// import java.util.Scanner;

// public class newexamples {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter Your Character:");
//         char character = scanner.next().charAt(0);

//         // Checking if the input is an alphabet
//         if (Character.isLetter(character)) {
//             // Converting the character to lowercase for easy comparison
//             char lowerChar = Character.toLowerCase(character);

//             // Condition to check if it is a vowel or consonant
//             if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
//                 System.out.println(character + " is a vowel and all conditions are followed:");
//             } else {
//                 System.out.println(character + " is a consonant and all conditions are satisfied:");
//             }

//         } else {
//             System.out.println("Invalid input. Please enter an alphabetic character.");
//         }

//         scanner.close();
//     }
// }

//write the code for check the given is aplhabet or digit or special character;

// import java.util.Scanner;
// public class newexamples{
//     public static void main(String[] args){

//         //this is for taking the input from the users;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your input is:");
//         char input = scanner.next().charAt(0);

//         //condition check ;
//         if (Character.isLetter(input)){

//             System.out.println(input + "is given input is character:");
//         }
//         else if( Character.isDigit(input))
//             {
//             System.out.println(input+ "is given input is digit:");
//         }
//         else{
//             System.out.println(input+ "is given input is special character:");
//    }
//              scanner.close();
//     }
// }

//write the code for check whether a character is uppercase or lowercase;

// import java.util.Scanner;

// public class newexamples {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your input:");

//         // Corrected variable name from 'Character' to 'character' to avoid conflicts
//         char character = scanner.next().charAt(0);

//         // Checking if the input is an alphabet
//         if (Character.isLetter(character)) {
//             if (Character.isUpperCase(character)) {
//                 System.out.println(character + " is an uppercase alphabet.");
//             } else if (Character.isLowerCase(character)) {
//                 System.out.println(character + " is a lowercase alphabet.");
//             }
//         } else {
//             System.out.println("Invalid input. Please enter valid an alphabetic character.");
//         }

//         scanner.close();
//     }
// }

//write the code for input week number and print week days;

// import java.util.Scanner;
// public class newexamples{
//     public static void main(String[] args){


//         Scanner scanner = new Scanner(System.in);// create the the users input;
//         System.out.println("Enter the weeks number:");//this for user give the input for processing;
//         int weeksnumber = scanner.nextInt();// read the users input and process it;

//         //calculate and print weeks day for input weeks number;
//         switch(weeksnumber){
//            case 1:
//             System.out.println("Monday:");
//             break;
//            case 2:
//            System.out.println("Tuesday:");
//            break;
//            case 3:
//            System.out.println("Wednesday:");
//            break;
//            case 4:
//            System.out.println("Thursday:");
//            break;
//            case 5:
//            System.out.println("Friday:");
//            break;
//            case 6:
//            System.out.println("Saturday:");
//            break;
//            case 7:
//            System.out.println("Sunday:");
//            break;
//            default:
//            System.out.println("Invalid inputs:Please Enter a valid weeks number between a 1 to 7:");

//         }
//         System.out.println("This weeks number are arranged according to the users input number and always perferrd by the users need first:");
//         scanner.close();

//         }

//     }

//write the code for input month number from the users and print number of days in that months;


// import java.util.Scanner;
// public class newexamples{
//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);// create the scanner class for take the inpurt from the users;
//         System.out.println("Enter the month Number:");// this is the input months number which given by the users;
//         int monthsNumber = scanner.nextInt(); // this for read the input which given by the users;

//     //calulate the monthNumber and print No.of days in this given months;

//     switch(monthsNumber){
//        case 1: //print January;
//          System.out.println("January:");
//          System.out.println("This month has 31 days:");
//          break;
//        case 3:
//          System.out.println("March:");
//          System.out.println( "This month has 31 days:");
//          break;
//        case 5:
//         System.out.println("May:");
//         System.out.println("This month has 31 days:");
//         break;
//        case 7:
//          System.out.println("July:");
//          System.out.println("This month has 31 days:");
//          break;
//        case 8:
//          System.out.println("August:");
//          System.out.println("This month has 31 days:");
//          break;
//       case 10:
//         System.out.println("October:");
//         System.out.println("This month has 31 days:");
//         break;
//       case 12:
//         System.out.println("December:");
//         System.out.println("This month has 31 days:");
//         break;
//         case 4:
//           System.out.println("April:");
//           System.out.println("This month has 30 days:");
//         break;
//         case 6:
//          System.out.println("June:");
//          System.out.println("This month has 30 days:");
//          break;
//         case 9:
//           System.out.println("September:");
//           System.out.println("This month has 30 days:");
//           break;
//         case 11:
//         System.out.println("November:");
//         System.out.println("This month has 30 days:");
//         break;
//         case 2:
//         System.out.println("February:");
//         System.out.println("This month has 28 & 29 days: if it has Been considered as leap year then it has 29 days otherwise it has 28 days:");
//         break;

//         default:
//         System.out.println("Invalid MonthsNumber: This is not valid monthsNumber and monthsNumber lies between 1 to 12 months: ");
//     }

//        scanner.close();
//     }
// }

// write the code for take the input monthsNumber and print this no.of month days ;

// import java.util.Scanner;
// public class newexamples{
//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);// create the scanner class for take the inpurt from the users;
//         System.out.println("Enter the month Number:");// this is the input months number which given by the users;
//         int monthsNumber = scanner.nextInt(); // this for read the input which given by the users;

//     calulate the monthNumber and print No.of days in this given months;

//     switch(monthsNumber){
//        case 1: //print January;

//        case 3://Marcbreak;h;

//        case 5://May;

//        case 7://July;

//        case 8://August;

//       case 10://October;

//       case 12://December;
//         System.out.println("This month has 31 days:");
//         break;
//         case 4://April;

//         case 6://June;

//         case 9: //September;

//         case 11://November;
//         System.out.println("This month has 30 days:");
//         break;
//         case 2://february;
//         System.out.println("This month has 28 & 29 days: if it has Been considered  as leap year then it has 29 days otherwise it has 28 days:");
//         break;

//         default:
//         System.out.println("Invalid MonthsNumber: This is not valid monthsNumber and monthsNumber lies between 1 to 12 months: ");
//     }

//        scanner.close();
//     }
// }


// write the code countr the total no.of notes in given amount;

// import java.util.Scanner;
// public class newexamples{
//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the Amount what you want:");
//         int amount = scanner.nextInt();


//          // Array of currency denominations;
//          int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

//          // Array to store the count of each denomination;
//          int[] noteCount = new int[notes.length];

//          // Calculate the number of notes for each denomination;
//          for (int i = 0; i < notes.length; i++) {
//              if (amount >= notes[i]) {
//                  noteCount[i] = amount / notes[i];
//                  amount = amount % notes[i];
//              }
//          }

//           // Display the results;
//         System.out.println("Currency count:");
//         for (int i = 0; i < notes.length; i++) {
//             if (noteCount[i] != 0) {
//                 System.out.println(notes[i] + " : " + noteCount[i]);
//             }
//         }
//            scanner.close();

//     }
// }


//write the code for give the input angles of the triangle and check whether triangle is valid or not;

// public static void main(String[] args){

//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter the  three angles of the triangles:");

//     int angle1 = scanner.nextInt();
//     int angle2 = scanner.nextInt();
//     int angle3 = scanner.nextInt();

//     //check the condition  if the triangles is valid or not;

//     if(angle1>0 && angle2>0 && angle3>0 && (angle1 + angle2 + angle3 == 180)){
//         System.out.println("The traingles is valid:");
//     }
//     else{
//         System.out.println("The triangles is not valid:");
//     }
//          scanner.close();
// }

// }


//write the code for take  an input all side of the traingle and check it is valid traingle or not;

//     public static void main(String[] args){

//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter the all three side of the triangles: ");

//            int sides1 = scanner.nextInt();
//            int sides2 = scanner.nextInt();
//            int sides3 = scanner.nextInt();

//            //condition check if the side of all triangle is valid or not;

//            if(sides1>0 && sides2>0 && sides3>0 &&
//             (sides1 + sides2 >sides3 &&
//             sides2 + sides3 >sides1 &&
//             sides1+ sides3 >sides2)){
//                 System.out.println("The traingle given by the user is valid:");

//             }else{
//                 System.out.println("The traingle side given by the users is not valid: ");
//             }
//             System.out.println("This line is print when the condition is check:");
//             scanner.close();
//     }

// }

// write teh code for check it Equalteral, Isosceles, scalene traingle or not;

//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);
//          System.out.println("Enter your sides of triangles:");

//          int sides1 = scanner.nextInt();
//          int sides2 = scanner.nextInt();
//          int sides3 = scanner.nextInt();

//          //condition check to identitfy the given triangle is belong to which one of them traingles;

//          if(sides1>0 && sides2>0 && sides3>0 &&
//          (sides1 + sides2 > sides3 &&
//          sides2 + sides3 > sides1 &&
//          sides1 + sides3 >sides2)){

//             // Determine the type of triangle
//             if (sides1 == sides2 && sides2 == sides3) {
//                 System.out.println("The triangle is an Equilateral triangle.");
//             }
//             else if (sides1 == sides2 || sides2 == sides3 || sides1 == sides3) {
//                 System.out.println("The triangle is an Isosceles triangle.");
//             }
//              else {
//                 System.out.println("The triangle is a Scalene triangle.");
//             }
//         } else {
//             System.out.println("Invalid triangle. The sides do not satisfy the triangle inequality theorem.");
//         }

//         scanner.close();

//          }
//     }

//write the code for check

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            // Prompt the user to input the coefficients of the quadratic equation
//            System.out.println("Enter the coefficient a:");
//            double a = scanner.nextDouble();
//            System.out.println("Enter the coefficient b:");
//            double b = scanner.nextDouble();
//            System.out.println("Enter the constant c:");
//            double c = scanner.nextDouble();
//
//            // Calculate the discriminant (b^2 - 4ac)
//            double discriminant = (b * b) - (4 * a * c);
//
//            // Check the nature of the roots based on the discriminant
//            if (discriminant > 0) {
//                // Two real and distinct roots
//                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//                System.out.println("The roots are real and distinct.");
//                System.out.println("Root 1 = " + root1);
//                System.out.println("Root 2 = " + root2);
//            } else if (discriminant == 0) {
//                // One real and repeated root
//                double root = -b / (2 * a);
//                System.out.println("The roots are real and equal.");
//                System.out.println("Root = " + root);
//            } else {
//                // Complex roots
//                double realPart = -b / (2 * a);
//                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
//                System.out.println("The roots are complex and imaginary.");
//                System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
//                System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
//            }
//
//            scanner.close();
//        }
//    }

// public class few{
//     public static void main(String args[]){
//         System.out.println("hello world!");


// public class few{
//     public static void main(String args[]){
//        Scanner scanner=  new Scanner(System.in);
//         System.out.print("entre the value of the second:");
//         int sec=sc.nextInt();
//         int p1=sec%60;
//         int p2=sec/60;
//         int p3=p2%60;
//         p2=p2/60;
//         System.out.println("HH:MM:SS" +p1+":" +p2+":" +p3);

//     }
// }


// public class TimeConverter {
//     public static void main(String[] args) {
//     int totalSeconds = 3661;  // Example input
//     convertSeconds(totalSeconds);
//     }

//     public static void convertSeconds(int totalSeconds) {
//     int hours = totalSeconds / 3600;
//     int minutes = (totalSeconds % 3600) / 60;
//     int seconds = totalSeconds % 60;

//     System.out.println(totalSeconds + " seconds is equal to:");
//     System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
//     }
//     }



//	Java program to find second largest element in an array.


// public class FirstLargestElement {
// public static void main(String[] args) {
// int[] array = {12, 35, 1, 10, 34, 1};
// int FirstLargest = findFirstLargest(array);
// System.out.println("The second largest element is: " + FirstLargest);
// }

// public static int findFirstLargest(int[] array) {
// int firstLargest = Integer.MIN_VALUE;
// //int secondLargest = Integer.MIN_VALUE;

// for (int num : array) {
// if (num > FirstLargest) {
// //secondLargest = firstLargest;
// FirstLargest = num;
// } else if (num > FirstLargest) {
// FirstLargest = num;
// }
// }

// return FirstLargest;
// }
// }


//write the code for Develop a program to simulate a basic login system with a predefined username and preDefined password.

import java.util.Scanner;
public class main{
    public static void main(String[] args){

        // This is predefined the  username and password;
        String preDefinedUsername = "Rahul kumar";
        String preDefinedPassword = "Rahul@12345";

        //Create the username and password;
        Scanner scanner = new Scanner(System.in);

        //This for take the input from the users;
        System.out.println("Welcome To The Login Profile!");

        //this for the Get username input

        System.out.println("Enter Your UserName:");
        String inputUsername = scanner.nextLine();

        //this for the Get username input

        System.out.println("Enter Your UserName:");
        String inputPassword = scanner.nextLine();

        // Check if the input matches the predefined credentials then print if coindition statement  otherwise print else condition statements;

        if(inputUsername.equals(preDefinedUsername) && inputPassword.equals(preDefinedPassword)){

            System.out.println("Login Profile SuccessFukklly! Acees your Profile"  + inputUsername + "!");
        }

        else{
            System.out.println("Login failed! Invalid username or password");
        }
        System.out.println("Please Enter Your valid username and password:");
        scanner.close();

    }
}


//write the code for Develop a program to simulate a basic login system with a predefined username and preDefined password and show the which credentials is wrong.

import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        // Predefined username and password
        String preDefinedUsername = "Rahul kumar";
        String preDefinedPassword = "Rahul@12345";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome To The Login Profile!");

        // Get username input
        System.out.print("Enter Your UserName: ");
        String inputUsername = scanner.nextLine();

        // Get password input
        System.out.print("Enter Your Password: ");
        String inputPassword = scanner.nextLine();

        // Check if the input matches the predefined credentials
        if (inputUsername.equals(preDefinedUsername) && inputPassword.equals(preDefinedPassword)) {
            System.out.println("Login Profile Successfully! Access your Profile " + inputUsername + "!");
        } else {
            if (!inputUsername.equals(preDefinedUsername)) {
                System.out.println("Login Failed! Invalid username!");
            }
            if (!inputPassword.equals(preDefinedPassword)) {
                System.out.println("Login Failed! Invalid password!");
                 System.out.println("Please Enter Your Valid credentials!");
            }
        }
        scanner.close();
    }
}






