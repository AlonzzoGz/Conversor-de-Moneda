import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivos {

    private static final String TXT_FILE_PATH = "historial_consultas.txt";

    public void guardarConversion(String conversion) {
        try {
            FileWriter fileWriter = new FileWriter(TXT_FILE_PATH, true); // true para modo append
            fileWriter.write(conversion);
            fileWriter.write("\n");
            fileWriter.close();
            System.out.println("Conversión guardada en 'historial_consultas.txt'");
        } catch (IOException e) {
            System.out.println("Error al guardar la conversión: " + e.getMessage());
        }
    }

    public void guardarHistorial(List<String> historial) {
        try {
            FileWriter fileWriter = new FileWriter(TXT_FILE_PATH);
            for (String conversion : historial) {
                fileWriter.write(conversion);
                fileWriter.write("\n");
            }
            fileWriter.close();
            System.out.println("Historial de consultas guardado en 'historial_consultas.txt'");
        } catch (IOException e) {
            System.out.println("Error al guardar el historial de consultas: " + e.getMessage());
        }
    }
}
