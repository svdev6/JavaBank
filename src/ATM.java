public class ATM implements Authenticatable {
    @Override
    public boolean authenticate(String pin) {
        // Lógica de autenticación...
        return true; // o false según el caso
    }
}