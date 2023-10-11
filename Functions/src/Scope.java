public class Scope {
    public static void main(String[] args) {
        int a = 7;
        String name = "helloabhii";
        System.out.println("The name is :"+name);
        {
            int c = 71;
            System.out.println(c); // outside the block of code you cannot  print c = 71
            a = 22;// reassign the original reference to some other value
            //it is not creating new one for creating new one you have to specify 'int a = 22'
            // in short intitalizing values will only accessible inside the block rest outside
            //same for the string
            //any value initialize inside block of code you cannot access outside
            // any value initialize outside you can use inside
            name = "ADHD";
            System.out.println(name);


        }
        int c = 69;// you are able to intialize c again because above c is scoped only inside that block {}
        System.out.println(c); // c is only accessible inside the block
        System.out.println(a);


        //Scoping in for loops
        for(int i = 0; i < 4; i++){
            System.out.println("For Loop "+ i);
            int z = 33;
        }

    }
}

