public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaBankATM! Version control with Git.");
        
        public boolean authenticateUser(String inputPin) {
            int attempts = 0;
            
            while (attempts < 3) {
                if (this.pin.equals(inputPin)) {
                    return true; // Si el PIN es correcto, retorna verdadero
                } else {
                    attempts++;
                    System.out.println("PIN incorrecto. Intento " + attempts + " de 3.");
                    // Aquí deberías pedir un nuevo PIN desde el código que llama este método
                }
            }
            
            return false; // Si no se acierta en 3 intentos, retorna falso
        }
        
    }
}