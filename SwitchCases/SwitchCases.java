import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Day 0-7 : ");
        int day = in.nextInt();

//        switch statement
        switch(day){
            case 1 -> System.out.println("Monday"); //break statement enhanced version
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
//or
        switch(day){
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
                  System.out.println("Weekdays");
                  break;
              case 6:
              case 7:
                  System.out.println("Wooah !!! Weekend");
                  break;

          }
          //same as enhanced version
        switch (day) {
            case 1,2,3,4,5 ->  System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
        }




        in.close();
    }
}
