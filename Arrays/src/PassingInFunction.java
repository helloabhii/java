import java.util.Arrays;
public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));// by change function we change the 0th index to 71

    }
    //Array passing in function
    static void change(int[] arr){//change is the function name
        arr[0] = 71; //we define that at 0th index  value is 71
        //so arrays are mutable in java
        // nums and arr pointing to the same array
        //string are not mutable
    }
}
