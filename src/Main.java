public class Main {
    public static int test_finally() {
        int num = 1;
        try {
            num++;
            System.out.println("try block, num = " + num);
            return num;
        } catch (Exception e) {
            System.out.println("catch block, num = " + num);
        } finally {
            num++;
            System.out.println("finally block, num = " + num);
        }
        return num;
    }
    public static void main(String[] args) {
        byte a=127;
        byte b=127;
        b= (byte) (a+b);
        a+=b;

        short s1= 1;
        s1 = (short) (s1 + 1);

        test_finally();
        System.out.println("Hello world!");
    }
}