package ex1;

class Exception2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Оператор после возникновения исключения");
        } catch (ArithmeticException e) {
            System.out.println("Дeлeниe на ноль.");
            System.out.println("После оператора catch.");
        }
    }
}