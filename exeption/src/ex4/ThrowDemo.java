package ex4;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Демонстрация генерации исключения");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в методе demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват : " + e);
        }
    }
}
