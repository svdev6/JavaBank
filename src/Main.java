public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, JavaBankATM!");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}