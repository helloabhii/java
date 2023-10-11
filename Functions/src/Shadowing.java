public class Shadowing {
    static int x = 71;//declaring x = 71 for every one but you can change it if you want
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;//local scope //only availabe in this particular block
        System.out.println(x); //40 /because of method overriding
        fun();
    }
    static void fun(){
        System.out.println(x);//print the global scope x = 71
    }
}
