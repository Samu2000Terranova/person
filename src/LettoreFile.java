import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LettoreFile {
    public static ArrayList<Persona> leggiFile(String nomeFile) throws IOException, NumberFormatException {
        ArrayList<Persona> persone = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(nomeFile));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String nome = tokens[0];
            String cognome = tokens[1];
            int annoNascita = Integer.parseInt(tokens[2]);
            Persona persona = new Persona(nome, cognome, annoNascita);
            persone.add(persona);
        }
        br.close();
        return persone;
    }
}