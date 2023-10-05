package com.abhi;
//reverse the numbers
public class Reverse {
    public static void main(String[] args) {
        int num = 28975;

        int ans = 0; //0

        while (num > 0) { //28975 //2897
            int rem = num % 10; //28975%10= 5remainder//2897%10=7 //9,8,2
            num /= 10;
            ans  = ans * 10 + rem; //ans=0,rem=5/
        }
        System.out.println(ans); //57982
        }
    }

