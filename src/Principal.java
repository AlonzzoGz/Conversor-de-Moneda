import com.google.gson.JsonSyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcionElegida = 0;

        ConsultaConversion consulta = new ConsultaConversion();
        Calculos calculos = new Calculos(consulta);
        GeneradorDeArchivos generador = new GeneradorDeArchivos();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas ***
                
                1) Peso Mexicano ==>> Dólar Estadounidense
                2) Peso Mexicano ==>> Euro
                3) Peso Mexicano ==>> Libra Esterlina
                4) Dólar Estadounidense ==>> Peso Mexicano
                5) Euro ==>> Peso Mexicano
                6) Libra Esterlina ==>> Peso Mexicano
                
                7) Otra opción de conversión
                
                8) Salir
                ***************************************************
                """;

        while (opcionElegida != 8) {
            try {
                System.out.println(menu);
                opcionElegida = Integer.parseInt(lectura.nextLine());

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcionElegida) {
                    case 1:
                        calculos.almacenarValores("MXN", "USD");
                        String conversion1 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion1);
                        generador.guardarConversion(conversion1); // Guardar la conversión individual
                        break;
                    case 2:
                        calculos.almacenarValores("MXN", "EUR");
                        String conversion2 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion2);
                        generador.guardarConversion(conversion2); // Guardar la conversión individual
                        break;
                    case 3:
                        calculos.almacenarValores("MXN", "GBP");
                        String conversion3 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion3);
                        generador.guardarConversion(conversion3); // Guardar la conversión individual
                        break;
                    case 4:
                        calculos.almacenarValores("USD", "MXN");
                        String conversion4 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion4);
                        generador.guardarConversion(conversion4); // Guardar la conversión individual
                        break;
                    case 5:
                        calculos.almacenarValores("EUR", "MXN");
                        String conversion5 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion5);
                        generador.guardarConversion(conversion5); // Guardar la conversión individual
                        break;
                    case 6:
                        calculos.almacenarValores("GBP", "MXN");
                        String conversion6 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion6);
                        generador.guardarConversion(conversion6); // Guardar la conversión individual
                        break;
                    case 7:
                        calculos.almacenarValoresPersonalizados();
                        String conversion7 = formattedDate + " - " + calculos.obtenerMensajeRespuesta();
                        respuestas.add(conversion7);
                        generador.guardarConversion(conversion7); // Guardar la conversión individual
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                }
            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Ingrese solo códigos de moneda válidos.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
            }
        }
        generador.guardarHistorial(respuestas); // Guardar el historial completo al finalizar el programa
        System.out.println("Finalizando programa");
    }
}
