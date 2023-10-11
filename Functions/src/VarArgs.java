import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        //when we don't know how many inputs are giving
        funx(); // rerturns empty array
        funx(1,2,3,4); // here you can take any number of arguments
        //here length is not constant it varies according to the input
//        multiple(2,3,"Abhii",4,56,71); //calling the function


    }
//    static void multiple(int a, int b, String c, int...z){//here we define 0th index - integer,2 - integer,
//        // 3rd - string and rest are Integer/ ...v always come at end of the declaring values/types
//        System.out.println(Arrays.toString(a+b+c+z));



    static void  funx(int ...v){ // basically it gives arrays of integers when you type int/you can type string there also
        System.out.println(Arrays.toString(v));

    }
}
