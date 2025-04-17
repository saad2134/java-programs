public class MultipleCatchFollowsTry {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[50] = 30/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Task 1 is completed.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 2 is completed.");
        }
        catch (Exception e) {
            System.out.println("Common Task completed.");
        }
        System.out.println("Rest of code....");
    }
}