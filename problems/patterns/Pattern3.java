// Write a java program to print the pattern
// 1
// 2    2
// 3    3   3
// 4    4   4   4

import java.io.*;

class Pattern3 {
    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        int i,j;
        
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}

//> java Pattern3.java 10