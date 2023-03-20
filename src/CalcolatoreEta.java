import java.util.Calendar;

public class CalcolatoreEta {
    public static int calcolaEta(Persona persona) throws InvalidAgeException{
        int annoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        int eta = annoCorrente - persona.getAnnoNascita();
        if (eta < 0) {
            throw new InvalidAgeException("L'anno di nascita non può essere nel futuro!");
        }
        return eta;
    }
}