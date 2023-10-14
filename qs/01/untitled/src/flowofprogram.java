import java.util.Scanner;
public class flowofprogram {
    public static void main(String[] args) {

//Ques 1-> Input a year and find whether it is a leap year or not ?
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();
        if(year % 4 == 0){
            System.out.println("This is leap year : "+year);
        }else{
            System.out.println("This is not a leap year");
        }

// Ques 2->
        
    }
}