/** Problem Statement - Binary Numbers (https://www.hackerrank.com/challenges/30-binary-numbers/problem) **/

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
        int count = 0;
        int maxNum = 0;
        while(n>0)
        {
            if(n%2==1)
            {
                count++;
                if(count>=maxNum)
                {
                    maxNum=count;
                }
            }
            else
            {
                count = 0;
            }
            n=n/2;
        }
        System.out.println(maxNum);

        scanner.close();
    }
}
