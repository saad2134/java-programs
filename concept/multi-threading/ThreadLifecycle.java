public class ThreadLifecycle {
	public static void main(String args[]) {
		Thread t = new Thread("My first thread");
		t.start();
		boolean isAlive = t.isAlive;
		String str = t.getName();
		System.out.println(str);
		if (Alive = true) {
			System.out.println("isAlive");
		} else {
			System.out.println("is not Alive");
		}

	}
}