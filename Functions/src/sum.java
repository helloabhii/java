import java.util.Scanner;

public class sum {
    public static void main(String[] args) { //static doesn't depend on object
        sum(); //calling the function /method /callby ()
        int ans = sum2();
        System.out.println("Sum of two numbers : "+ans);

    }
      static  void sum (){ //void - return type / sum - name of function/
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of the 2 numbers : "+sum);

    }
    //Return the value
    static int sum2(){ //return data type as integer so we write int here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; //return means function over here
        // means after return statement you cannot write anything

    }
}
