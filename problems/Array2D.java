import java.lang.reflect.Array;

public class Array2D {

    public static void main(String[] args) {
        int arr[][]= {
            {0,2,4},
            {6,8,10},
            {12,14,16}
        };

        System.out.println("The 3x3 Matrix: ");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (Integer.toString(arr[i][j]) == 1) {
                    System.out.print(arr[i][j]+" ");
                }
                else if (Integer.toString(arr[i][j]) == 2) {
                    System.out.print(arr[i][j]+"  ");
                }
                
            }
            System.out.println();
        }
        System.out.println();

        int det = (
            (arr[1-1][1-1] * (
                (arr[2-1][2-1]*arr[3-1][3-1]) - (arr[2-1][3-1]*arr[3-1][2-1])
                )) -
            (arr[1-1][2-1] * (
                (arr[2-1][1-1]*arr[3-1][3-1]) - (arr[3-1][1-1]*arr[2-1][3-1])
                )) +
            (arr[1-1][3-1] * (
                (arr[2-1][1-1]*arr[3-1][2-1]) - (arr[2-1][2-1]*arr[3-1][1-1])
                ))
        );
        System.out.println("The Determinant: "+det);

        int trace = (arr[1-1][1-1] + arr[2-1][2-1] + arr[3-1][3-1]);
        System.out.println("The Trace: "+trace);
        
    }
}