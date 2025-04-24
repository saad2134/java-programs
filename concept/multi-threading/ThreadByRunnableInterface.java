class ThreadByRunnableInterface implements Runnable {
    public void run() {
        System.out.println("Thread is running....");
    }

    public static void main(String args[]) {
        ThreadByRunnableInterface m1 = new ThreadByRunnableInterface();
        Thread t1 = new Thread(m1); // using constructor Thread(Runnable r)
        t1.start();
    }
}