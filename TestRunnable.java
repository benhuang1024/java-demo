class TestRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("loding runnable" + i);
        }
    }

    public static void main(String[] args) {
        TestRunnable testRunnable1 = new TestRunnable();
        new Thread(testRunnable1).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("doing runnable" + i);
        }
    }

}
