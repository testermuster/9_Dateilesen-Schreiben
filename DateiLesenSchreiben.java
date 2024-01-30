import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DateiLesenSchreiben {

    public static void main(String[] args) {
        // Pfad zur Quelldatei und zur Zieldatei
        String quelleDateiPath = "eingabe.txt";
        String zielDateiPath = "ausgabe.txt";

        try (FileReader fileReader = new FileReader(quelleDateiPath);
             FileWriter fileWriter = new FileWriter(zielDateiPath)) {
            
            int zeichen;
            while ((zeichen = fileReader.read()) != -1) {
                fileWriter.write(zeichen);
            }
            System.out.println("Datei wurde erfolgreich kopiert.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
