public class ArraySum {

    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {
            Integer.parseInt(args[0]), 
            Integer.parseInt(args[1])
        };

        for (int i:arr) {
            sum = sum +i;
        }
        System.out.println("Sum is "+sum);
    }
}