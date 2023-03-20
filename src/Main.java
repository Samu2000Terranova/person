import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file1 = "src/persona1.txt";
        String file2 = "src/persona2.txt";
        String file3 = "src/persona3.txt";
        String file4 = "src/persona4.txt";
        String file5 = "src/persona5.txt";
        String file6 = "src/persona6.txt";
        String file7 = "src/persona7.txt";

        String [] files = {file1,file2,file3,file4,file5,file6, file7};

        for (String filename : files){
            System.out.println("File: "+filename+"\n");
            try{
                ArrayList <Persona> persone = LettoreFile.leggiFile(filename);
                for (Persona persona : persone){
                    String nome = persona.getNome();
                    String cognome = persona.getCognome();
                    String annoNascita = persona.getAnnoNascita()+"";

                    System.out.print(nome+" "+cognome+" "+annoNascita);

                    try{
                        int eta = CalcolatoreEta.calcolaEta(persona);
                        System.out.println(" età: "+eta);
                    } catch (InvalidAgeException e){
                        System.out.println(" età non valida!");
                        System.out.println(e.getMessage());
                    }
                }
            } catch (IOException e) {
                System.out.println("IOException!");
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Il file: "+filename+" presenta un anno di nascita non valido");
                System.out.println(e.getMessage());;
            } finally {
                System.out.println();
            }
        }
    }
}