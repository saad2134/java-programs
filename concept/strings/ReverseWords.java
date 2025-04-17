public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World! Java";
        String[] words = sentence.split(" ");
        String revSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            revSentence += words[i];
            if (i != 0) {
                revSentence += " ";
            }
        }

        System.out.println(revSentence);
    }
}