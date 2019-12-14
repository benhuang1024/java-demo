public class demo2 {
    public String a;
    public String b;

    public static void main(String[] args) {
        fibonacciSequence(10);
        demo2 d2 = new demo2();
        String a = "1";
        String b = "bo";
        d2.exchangeVariable(a, b);
        System.out.println(d2.a);
        System.out.println(d2.b);
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

    public void exchangeVariable(String a, String b) {
        this.a = b;
        this.b = a;
    }
}