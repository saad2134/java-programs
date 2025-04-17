// Write a java program to print the pattern
//                 1               
//         1                2       
//     1        2        3        4
// 1        2        3        4        5       

import java.io.*;

class Pattern5 {
    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        int i,j,k; 

        // 1 tab = 4 spaces
        int outertabs;
        int innertabs;
        
        for (i=1; i<=n; i++) {
            //Calculate and print outer tab
            int exp = i;
            int pow = 2;

            for(; exp<=0; exp--) {
                pow = pow*pow;
            }
            outertabs = (4 / pow);


            for(k=1; k<=outertabs; k++) {
                System.out.print("    ");
            }

            //Print Inner Tabs and elements
            innertabs = outertabs * 2;
            for (j=1; j<=i; j++) {
                System.out.print(j);
                for(k=1; k<=innertabs; k++) {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}

//> java Pattern4.java 4