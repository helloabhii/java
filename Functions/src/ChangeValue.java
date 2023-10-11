import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        //create an array /array - collection of numbers
        int[] arr = {1,3,7,71};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  change(int[] nums){
        nums[0] = 69; // changing the 0th index of the 'arr'
    }
}
