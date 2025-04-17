public class MultiplicationTable {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int s = 50;

        System.out.println("\n[Multiplication Table]");
        for(int i=1; i<=s; i++) {
            int ans = n*i;
            System.out.println(n+" x "+i+" = "+ans);
        }
    }
}
