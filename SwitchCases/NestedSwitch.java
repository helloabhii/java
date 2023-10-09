import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Employee ID : ");
        int empID =  in.nextInt();
        System.out.print("Enter the Department : ");
        String department = in.next();

        switch (empID) {
            case 1 :
                System.out.println("Abhishek Verma");
                break;
            case 2:
                System.out.println("Rajat Attri");
                break;
            case 3:
                switch(department) { //switch inside switch
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department Entered");
                }
                break;
            default :
                System.out.println("Enter correct empID");
        }
    }
}
