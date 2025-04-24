public class ThreadByExtendingThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ThreadByExtendingThreadClass t1 = new ThreadByExtendingThreadClass();
        t1.start();
    }
}