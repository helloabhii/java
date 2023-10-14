import java.util.Scanner;
public class flowofprogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

////////////

        System.out.println("Ques 1-> Input a year and find whether it is a leap year or not ?");

        System.out.print("Enter the year : ");
        int year = in.nextInt();

        if(year % 4 == 0){
            System.out.println("This is leap year : "+year);
        } else{
            System.out.println("This is not a leap year");
        }

////////////

        System.out.println("Ques 2-> Take input of two numbers and print the sum of both ?");

        System.out.print("Enter the First Number : ");
        int num_1 = in.nextInt();
        System.out.print("Enter the Second Number : ");
        int num_2 = in.nextInt();

        int sum = num_1 + num_2 ;

        System.out.println("Sum Of Two Numbers : "+ sum);

////////////
        

    }
}