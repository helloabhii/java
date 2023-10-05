package com.abhi;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //take input from user till user doesn't press 'x' or 'X'
        int ans = 0;
        while (true){
            //take the operator as input
            System.out.print("Enter The Operator : ");
            char ak = in.next().trim().charAt(0);

            if(ak == '+' || ak == '-' || ak == '*' || ak == '/' || ak == '%'  ){
                //input two Numbers
                System.out.print("Enter Two Numbers : ");
                int num1 = in.nextInt(); //taking input as integer
                int num2 = in.nextInt();

                if (ak == '+') {
                    ans = num1 + num2;
                }
                if (ak == '-') {
                    ans = num1 - num2;
                }
                if (ak == '*') {
                    ans = num1 * num2;
                }
                if (ak == '/') {
                    if(num2 != 0){
                        ans = num1 / num2;
                }
                }
                if (ak == '%'){
                    ans = num1%num2;
                }

            } else if (ak == 'x' || ak == 'X') {
                break;
            }else {
                System.out.println("Invalid Operation !!! ");
            }System.out.println(ans);
        }


    }
}
