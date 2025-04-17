public class StringOps {

    public static void main(String[] args) {
        String s1 = "String1";
        String s2 = "String2";
        String s3 = "     TRIM ME      ";
        String s4 = s3.trim();

        System.out.println("\nString Comparision using compareTo(): ");
        System.out.println(s1.compareTo(s2));

        System.out.println("\nString Comparision using equals(): ");
        System.out.println(s1.equals(s2));

        System.out.println("\nString Comparision using ==: ");
        System.out.println(s1 == s2);

        System.out.println("\nString Concantenation using concat(): ");
        System.out.println(s1.concat(s2));

        System.out.println("\nString Concantenation using +: ");
        System.out.println(s1+s2);

        System.out.println("\nString trimming using trim: ");
        System.out.println(s3.trim());

        System.out.println("\nString find and replace: ");
        System.out.println(s3.replace("TRIM ME", "I WAS TRIMMED"));

        System.out.println("\nString startsWith(): ");
        System.out.println(s3.startsWith("TRIM"));

        System.out.println("\nGetting length of string with length(): ");
        System.out.println(s3.length());

        System.out.println("\nGetting char at index with charAt(index): ");
        System.out.println(s3.charAt(10));

        System.out.println("\nGetting substring with substring(beginIndex): ");
        System.out.println(s3.substring(10));

        System.out.println("\nChecking whether string contains 'TRIM' with contains(): ");
        System.out.println(s3.contains("TRIM"));

        System.out.println("\nChecking whether string is empty with isEmpty(): ");
        System.out.println(s3.isEmpty());
    }
}