/** Problem Statement - Lets review (https://www.hackerrank.com/challenges/30-review-loop/problem) **/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.nextLine();
        while(number >0)
        {
            String str = input.nextLine();
            char arr[] = str.toCharArray();
            int len= str.length();
            for(int x=0;x<len;x=x+2)
            {
            
                System.out.print(arr[x]);
            
            }
        
            System.out.print(" ");
        
            for(int x=1;x<len;x=x+2)
            {
            
                System.out.print(arr[x]);
            }
        
            System.out.println();
            number--;
        }
    }
}
