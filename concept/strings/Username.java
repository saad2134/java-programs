public class Username {

    public static void main(String[] args) {
        String uname = args[0];

        if (uname.length() < 5) {
            System.out.println("Invaid Username: Must be 5 or more characters long!");
            return;
        }


        if (Character.isUpperCase(uname.charAt(0)) == false) {
            System.out.println("Invaid Username: The first character must be a uppercase alphabet.");
            return;
        }

        for (int i = 0; i < uname.length(); i++) {
            char ch = uname.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("Invalid Username: The username must contain only alphabets and numbers.");
                return;
            }
        }

        System.out.println("The username is valid!");
        return;
    }
}