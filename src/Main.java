import DSA.stack.DynamicArrayStack;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;


public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = {2,1,3};
        System.out.println(findMax(arr,arr.length-1));
    }
    //General Problems on Recursion
    //Factorial of Number
    public static int factorial(int n) {
        if (n==1||n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    //Sum of digit of a number
    public static int sumOfDigits(int number){
        if (number == 0){
            return 0;
        }
        return number%10 + sumOfDigits(number/10);
    }
    //fibonacci
    public static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //
    public static String reverseString(String str){
        if (str.isEmpty()||str.length()==1)
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static int powerOfNumber(int x, int n){
        if (n==0)
            return 1;
        return x * powerOfNumber(x, n-1);
    }
    public static int findMax(int[] arr, int index) {
        if (index == 0){
            return arr[0];
        }
        int value = findMax(arr, index-1);
        return Math.max(arr[index], value);
    }
}