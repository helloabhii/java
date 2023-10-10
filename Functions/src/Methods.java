
import java.util.Scanner;

public class Methods {//in java functions called as Methods
    //function is nothing but block of codes
    public static void main(String[] args) {
//Ques : Take input of two numbers and print the sum
        Scanner in = new Scanner(System.in); //Scanner is a class in java
        //in is a variable name you can choose any one but 'in' - suggested
        //System.in tells that you want user input
        System.out.print("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum of the 2 numbers : "+sum);
    }
}
