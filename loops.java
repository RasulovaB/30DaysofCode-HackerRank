/** Problem statement - Loops (https://www.hackerrank.com/challenges/30-loops/problem) **/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int x = 1; x < 11; x++)
        {
            System.out.println(n +" x " +x +" = " +(n*x));
        }
        scanner.close();
    }
}
