// Write a java program to print the pattern
// 1
// 1    4
// 1    4   9
// 1    4   9   16

import java.io.*;

class Pattern2 {
    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        int i,j;
        
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(j*j);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}

//> java Pattern2.java 10