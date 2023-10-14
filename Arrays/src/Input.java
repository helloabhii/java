import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //array of primitives
        int[] arr = new int[5];
        arr[0] = 71;
        arr[1] = 69;
        arr[2] = 68;
        arr[3] = 21;
        arr[4] = 22;
        // internally it stores like : [71,69,68,21,22]
        System.out.println("Array at 0th index : "+ arr[0]);

        //input using for loop
        for (int i = 0;i < arr.length;i++){// arr.length -the length of integer
            arr[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(arr));// Arrays.toString adding [ and , inside the array by using for loop


//            System.out.print(arr[i]+" "); //print the input that you give /" " - print in a single line

            //for each loop
//            for(int num : arr){ // for every element in array, print the element
//                System.out.print(num +" ");//num represents elements of array

// array of objects
        String[] str = new String[3];//here we write 3 means size (n-1)
        for(int i = 0;i < str.length; i++){
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
        str[1] = "Linux"; //we modify the 1st index element
        System.out.println(Arrays.toString(str));


        }

    }

