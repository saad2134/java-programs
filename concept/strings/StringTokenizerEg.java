import java.util.StringTokenizer;

public class StringTokenizerEg {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Methodist College");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}