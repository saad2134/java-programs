public class StringBufferEg {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");
        StringBuffer sb_append = new StringBuffer("Hello");
        StringBuffer sb_insert = new StringBuffer("Hello");
        StringBuffer sb_replace = new StringBuffer("Hello");
        StringBuffer sb_delete = new StringBuffer("Hello");
        StringBuffer sb_reverse = new StringBuffer("Hello");
        
        //Appending
        sb_append.append("Java");
        System.out.println(sb_append);

        //Inserting
        sb_insert.insert(1, "Java");
        System.out.println(sb_insert);

        //replaceing
        sb_replace.replace(1, 3, "Java");
        System.out.println(sb_replace);

        //Deleting
        sb_delete.delete(1,3);
        System.out.println(sb_delete);

        //Reversing
        sb_reverse.reverse();
        System.out.println(sb_reverse);

        //Checking character at index 6
        System.out.println(sb.charAt(6));

        //Checking length of StringBuffer
        System.out.println(sb.length());

        //Checking capacity of StringBuffer
        System.out.println(sb.capacity());
    }
}

