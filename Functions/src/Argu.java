import java.util.Scanner;
public class Argu {
    public static void main(String[] args) {
//        Scanner new = in Scanner(System.in);
        //Pass the value of  numbers when you  are calling  the method in main()

           int ans = add(2,3); //giving arguments to the function
           System.out.println("Sum of Two Numbers : " +ans);
    }
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }


}
