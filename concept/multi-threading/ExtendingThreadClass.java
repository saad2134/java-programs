public class ExtendingThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ExtendingThreadClass t1 = new ExtendingThreadClass();
        t1.start();
    }
}