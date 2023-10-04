package com.abhi;

import java.util.Scanner; //Scanner class import for taking input

public class CaseCheck{ //class name should be the same as the file name
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = "helloabhii"; //String - data type and word - variable
        System.out.println(word.charAt(0)); //print word
        //at index 0th - h
        System.out.print("Enter the Character : ");
        char ch = in.next().trim().charAt(0); // input the charcter by this line // trim means removes the extra space

        if(ch >= 'a' && ch <= 'z'  ){ //&& means both conditions should be  true
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase"); //if 'if' condition doesn't execute then else condition executes
        }
    }
}

