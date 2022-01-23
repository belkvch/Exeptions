package ex1;

import java.util.Random;

class HandleError {
    public static void main(String[] args) {
        int a;
        int b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                b = r.nextInt(10);
                System.out.println("b = " + b);
                a = 1234 / b;
            } catch (ArithmeticException e) {
                System.out.println("Дeлeниe на ноль.");
                a = 0;
            }
            System.out.println("a = " + a);
        }
    }
}
