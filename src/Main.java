import DSA.stack.DynamicArrayStack;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;


public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<Character>();

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
    //
}