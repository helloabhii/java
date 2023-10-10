import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        String  msg = str(); //put function into the variable
        System.out.println(msg);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println();


    }
    static String  str(){
        String Greeting = "How are you ? ";
        return Greeting; // if you declare over String then you have to return string also

    }
}
