public class Overloading {
    public static void main(String[] args) {
        //more than 1 function can exists only if parameter they have given is different
        fun2(71);
        fun2("Abhishek");
        //at compile time it decides which function to run
//        fun2(3);
    }
    static void fun2(int a){//either number of argument should be different or type should be different
        System.out.println(a);
    }
    static void fun2(String name) {
        System.out.println(name);
    }
}
