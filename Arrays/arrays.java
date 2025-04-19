package Arrays;

public class arrays {
    public static void main(String[] args) {
        System.out.println("heloo");
    }
}



// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.

public class arrays {
    public static void main(String[] args){

        int i ,length;
        //decalred an array of the intgers;
        int[] arr;

        //allocating the array in the memory for 5 integers;
        arr  = new int[5];

        //initilization of an array elements;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //accesing the elements of the specific array;

        for(i=0; i<=arr.length; i++){
            System.out.println("Element at indexes" +i+ ":" +arr[i]);
        }



//write the code for given an array A of positive integers task is to find the leader in the array is to be leader if it greater than or euals to all elemnts of the right side then the right most elements is always cosidered as leaders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeader(arr);

        System.out.println("Leaders in the Array: " + leaders);
    }

    // Method to find leaders in the array
    public static List<Integer> findLeader(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        int n = arr.length;

        // Identify the rightmost leader element
        int maxFromRightMost = arr[n - 1];
        leaders.add(maxFromRightMost);

        // Traverse the array from the backward
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRightMost) {
                maxFromRightMost = arr[i];
                leaders.add(maxFromRightMost);
            }
        }

        // Reverse the list to maintain the order of leaders in the array
        Collections.reverse(leaders);
        return leaders;
    }
}

        System.out.println("We have successfully find the elments:");
    }

}



// //Write a Java program to declare, initialize, and print the elements of an arrays;

// public class LeaderInArray{
//     public static void main(String[] args){
//         //decleared and initalized the array of the elements;
//         int[] numbers = {10,20,30,40,50};

//         System.out.println("Elemenst of an array: ");

//         //traverse the Elements of an array;
//         for(int i=0; i<numbers.length; i++){
//                 System.out.println(numbers[i]);
//         }
//     }
// }


//Write a Java program to declare, initialize, and print the elements of an arrays and array value taken from the users;
import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Traverse and print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}

//This code for Bubble sort Algorithms

//package Arrays;

// 1.  Write a Java program to implement Bubble Sort for an integer arrays.
////
/// / public class BubbleSort {
/// /     public static void bubbleSort(int[] arr) {
/// /         int n = arr.length;
/// /         for (int i = 0; i < n - 1; i++) {
/// /             for (int j = 0; j < n - i - 1; j++) {
/// /                 if (arr[j] > arr[j+1]) {
/// /                     // Swap elements
/// /                     int temp = arr[j];
/// /                     arr[j] = arr[j+1];
/// /                     arr[j+1] = temp;
/// /                 }
/// /             }
/// /         }
/// /     }

//     public static void main(String[] args) {
//         int[] arr = {64, 34, 25, 12, 22, 11, 90};

//         System.out.println("Original Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         // This line calls the bubbleSort method, passing the array arr as an argument. The bubbleSort method sorts the array in ascending order.
//         bubbleSort(arr);


//         // This line calls the bubbleSort method, passing the array arr as an argument. The bubbleSort method sorts the array in ascending order.
//         System.out.println("\nSorted Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// //- Write a Java program to implement Bubble Sort for an integer arrays.

// public class BubbleSort {
//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // Swap elements
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {64, 34, 25, 12, 22, 11, 90};

//         System.out.println("Original Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         // This line calls the bubbleSort method, passing the array arr as an argument. The bubbleSort method sorts the array in ascending order.
//         bubbleSort(arr);


//         // This line calls the bubbleSort method, passing the array arr as an argument. The bubbleSort method sorts the array in ascending order.
//         System.out.println("\nSorted Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


// write the code for Bubble sorting algorithms implemented in an arrays Descending order of an arrays:

// public class BubbleSort{
//     public static void bubblesort(int[] arr){
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//                     for (int j = 0; j < n - i - 1; j++) {
//                         if (arr[j] < arr[j + 1]) { // array are soted in descending order:

//                             // Swap elements
//                             int temp = arr[j];
//                             arr[j] = arr[j + 1];
//                             arr[j + 1] = temp;
//                         }
//                     }
//                 }
//             }

//             public static void main(String[] args){
//                 int[] arr = {3,2,1,5,4,19,16,17};

//                 System.out.println("Original Array of An Elements:");
//                 for(int num : arr){
//                     System.out.print(num +" ");
//                 }

//                 //This is calling function for sortinhg ana elements:
//                 bubblesort(arr);

//                 System.out.println("\nSorted Array of An Elements:");
//                 for(int num : arr){
//                     System.out.print(num + " ");
//                 }
//             }

//     }




// write the code for Bubble sorting algorithms implemented in an arrays Ascending order of an arrays:


// public class BubbleSort{
//     public static void bubblesort(int[] arr){
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//                     for (int j = 0; j < n - i - 1; j++) {
//                     if (arr[j] > arr[j + 1]) { // array are soted in Ascending order:

//                             // Swap elements
//                             int temp = arr[j];
//                             arr[j] = arr[j + 1];
//                             arr[j + 1] = temp;
//                         }
//                     }
//                 }
//             }

//             public static void main(String[] args){
//                 int[] arr = {3,2,1,5,4,19,16,17};

//                 System.out.println("Original Array of An Elements:");
//                 for(int num : arr){
//                     System.out.print(num +" ");
//                 }

//                 //This is calling function for sortinhg ana elements:
//                 bubblesort(arr);

//                 System.out.println("\nSorted Array of An Elements:");
//                 for(int num : arr){
//                     System.out.print(num + " ");
//                 }
//             }

//     }

// write the code for  Write a Java program to implement Bubble Sort for an integer array;

// public class BubbleSort{
//      public static void bubblesort(char[] arr){
//         char n = arr.length;
//         for(int i = 0; i<n-1; i++){
//             for(int j = 0; j<n-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap the elements;

//                     char temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//      }

//      public static void main(String[] args){
//         char[] arr ={'z','y','x','w','p','q','r','s','t','u','v','a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','o'};

//         System.out.println("Original Array of An elemnts:");
//         for(char num :arr){
//         System.out.print(num +" ");
//      }

//      bubblesort(arr);
//     }
//     System.out.println("\n Sorted array of ann elements:");
//        for(char num :arr){
//         System.err.print(num + " ");

//        }
//     }

// public class BubbleSort {
//     public static void bubbleSort(char[] arr) {
//         int n = arr.length; // Correct loop variable type

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) { // Ascending order logic
//                     // Swap elements
//                     char temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Corrected character array initialization
//         char[] arr = {'z', 'y', 'x', 'w', 'p', 'q', 'r', 's', 't', 'u', 'v', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};

//         System.out.println("Original Array:");
//         for (char num : arr) {
//             System.out.print(num + " ");
//         }

//         bubbleSort(arr); // Sort the array

//         System.out.println("\nSorted Array:");
//         for (char num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



//write the code for modify the character is an alphabetically;

// import java.util.Arrays;

// public class BubbleSort{
//     public static void bubblesort(String[] arr){
//           int n = arr.length;

//           for(int i =0; i<n-1; i++){
//             for(int j =0; j<n-i-1; j++){
//                 if(arr[j].compareTo(arr[j+1])>0){
//                     // we have performed the swapping  for arranged  the according to users needs;

//                     String temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//           }
//     }

//     public static void main(String[] args){
//         String[] arr = {"Pear","Mango","PineApple","Grapes","JackFruits","Litchi","Sweeden","Oranges","Apples"};

//         //call the sorted array of code;

//         bubblesort(arr);

//        Here are solutions for each request:

// 1. Bubble Sort for an Integer Array
// public class BubbleSort {
//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) { // Ascending order
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {64, 34, 25, 12, 22, 11, 90};
//         bubbleSort(arr);
//         System.out.print("Sorted Array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



//2. Bubble Sort for an Array of Strings Alphabetically
// import java.util.Arrays;

// public class BubbleSortStrings {
//     public static void bubbleSort(String[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j].compareTo(arr[j + 1]) > 0) { // Alphabetical order
//                     String temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String[] arr = {"apple", "orange", "banana", "grape", "pear"};

//        System.out.println("Original Array Of An Elements:");
//        for(String num:arr){
//         System.out.print(num + " ");
//        }
//        //this hel[p for finding the sorting elemnts in ana array and find the toatal length of an arrays;
//         bubbleSort(arr);

//         System.out.println(" \nSorted Array of An elements:");
//         for(String num:arr){
//             System.out.print(num + " ");
//         }

//     }
// }

// 

// 3. Bubble Sort to Sort an Array in Descending Order
// public class BubbleSortDescending {
//     public static void bubbleSortDescending(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] < arr[j + 1]) { // Descending order
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 2, 5, 1, 4};
//         bubbleSortDescending(arr);
//         System.out.print("Sorted Array in Descending Order: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// 

// 4. Bubble Sort to Find Number of Swaps
// public class BubbleSortSwaps {
//     public static int bubbleSortWithSwaps(int[] arr) {
//         int n = arr.length;
//         int swapCount = 0; // To track swaps
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swapCount++;
//                 }
//             }
//         }
//         return swapCount;
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 1, 4, 2, 8};
//         int swaps = bubbleSortWithSwaps(arr);
//         System.out.print("Sorted Array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println("\nNumber of Swaps: " + swaps);
//     }
// }

// 

// 5. Bubble Sort for a 2D Array Row-Wise
// import java.util.Arrays;

// public class BubbleSort2D {
//     public static void bubbleSortRows(int[][] matrix) {
//         for (int[] row : matrix) {
//             int n = row.length;
//             for (int i = 0; i < n - 1; i++) {
//                 for (int j = 0; j < n - i - 1; j++) {
//                     if (row[j] > row[j + 1]) { // Ascending order within each row
//                         int temp = row[j];
//                         row[j] = row[j + 1];
//                         row[j + 1] = temp;
//                     }
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {64, 34, 25, 12},
//             {22, 11, 90, 55},
//             {44, 33, 99, 88}
//         };

//         bubbleSortRows(matrix);

//         System.out.println("Sorted 2D Array Row-Wise:");
//         for (int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }




//     }
// }

import java.util.Arrays;

public class BubbleSort{
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) { // Alphabetical order in descending ordered;
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "grape", "pear"};

        System.out.println("Original Array Of An Elements:");
        for(String num:arr){
            System.out.print(num + " ");
        }
        //this hel[p for finding the sorting elemnts in ana array and find the toatal length of an arrays;
        bubbleSort(arr);

        System.out.println(" \nSorted Array of An elements:");
        for(String num:arr){
            System.out.print(num + " ");
        }

    }
}



