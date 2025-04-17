// Write a java program to print the pattern
// 1
// 1    2
// 1    2   3
// 1    2   3   4

import java.io.*;

class Pattern1 {
    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        int i,j;
        
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}

//> java Pattern1.java 10