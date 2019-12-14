public class demo2 {
    public static void main(String[] args) {
        fibonacciSequence(10);
    }

    public static void fibonacciSequence(int num) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(0);
        for (int i = 1; i < num; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}