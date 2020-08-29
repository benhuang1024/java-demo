

public class TestThread extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("loding " + i);
        }
    }

    public static void main(String[] args) {
        TestThread testThread1 = new TestThread();
        testThread1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("doing" + i);
        }
    }
}