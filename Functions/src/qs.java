import java.util.Scanner;
public class qs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println("Given Number  is prime : "+ans);
        System.out.print("Given Number is Armstrong : ");
        System.out.println(isArmstrong(153));

        for (int i = 100; i < 1000; i++){ //prints all  armstrong numbers between 100-1000
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if (n % c == 0){
                return false; //return means program over
            }
            c++;
        }
        if (c *c > n){
            return true;
        }
        return false;

    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}
