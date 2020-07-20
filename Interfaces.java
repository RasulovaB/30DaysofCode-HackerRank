// [Problem Statement] - Intefaces (https://www.hackerrank.com/challenges/30-interfaces/problem)

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int totalDivisors = n;
        for(int x=1; x<= n/2; x++)
        if(n % x==0)
        {
            totalDivisors= totalDivisors + x;
        }
        return totalDivisors;
    }
}
