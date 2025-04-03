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
