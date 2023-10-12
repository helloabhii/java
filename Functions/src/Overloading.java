import java.util.Arrays;
public class Overloading {
    public static void main(String[] args) {
        //more than 1 function can exists only if parameter they have given is different
        fun2(71);
        fun2("Abhishek");
        //at compile time it decides which function to run
//        fun2(3);
        System.out.println(sum(2,3)); //first function
        int x = sum(2,3,4); //last function
        System.out.println(x);
        demo(1,2,3);
        //cannot be empty when you are overriding var agrs
        demo("Abhi","Linux");// both works
    }
    static void fun2(int a){//either number of argument should be different or type should be different
        System.out.println(a);
    }
    static void fun2(String name) {
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a + b ;
    }
    static int sum(int a, int b, int c){
        return a + b + c ;
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
