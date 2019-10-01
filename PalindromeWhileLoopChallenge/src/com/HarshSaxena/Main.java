package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isPalindrome(1001);

    }

    public static boolean isPalindrome(int number){
        if((number > -9) && (number < 9)){
            return false;
        }
        int originalNumber = number;
        int reverseNumber = 0;
        while((number > 0)|| (number*-1>0)){
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        if(reverseNumber == originalNumber){
            System.out.println(reverseNumber);
            return true;
        }else{
            return false;
        }
    }

}
