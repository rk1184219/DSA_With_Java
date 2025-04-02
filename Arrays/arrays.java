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

        System.out.println("We have successfully find the elments:");
    }

}
