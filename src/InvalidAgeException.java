public class InvalidAgeException extends IllegalArgumentException {

    public InvalidAgeException() {
        super("Età invalida");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}