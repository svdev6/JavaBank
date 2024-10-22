public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaBankATM! Version control with Git.");
        // Variables básicas
        String accountNumber = "123456789";
        double balance = 1500.75;
        int pin = 1234;
        boolean isActive = true;
        char inicial = 'A';
        byte edad = 30;
        short smallNumber = 32000;
        long bigNumber = 10000000000L;
        float temperatura = 36.6f;

        // Array de montos de transacciones
        int[] transactionAmounts = {200, -100, 50};

        // Operaciones con variables
        balance += transactionAmounts[0];
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso concedido");
        }

        balance++;
        String status = (balance < 0) ? "Deuda" : "Crédito";
        System.out.println("Estado de cuenta: " + status);  
    }
}