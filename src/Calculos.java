import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);
    ConsultaConversion conversion;

    public Calculos(ConsultaConversion conversion) {
        this.conversion = conversion;
    }

    public void almacenarValores(String monedaBase, String monedaObjetivo) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;

        System.out.println("Ingrese el valor que deseas convertir");

        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public void almacenarValoresPersonalizados() {
        System.out.println("Ingrese la moneda base con 3 letras");
        this.monedaBase = lectura.next();
        System.out.println("Ingrese la moneda objetivo con 3 letras");
        this.monedaObjetivo = lectura.next();

        boolean entradaValida = false;
        do {
            System.out.println("Ingrese el valor que deseas convertir");
            if (lectura.hasNextDouble()) {
                this.cantidad = lectura.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Error. Ingrese un valor numérico.");
                lectura.next(); // Limpiar el buffer de entrada
            }
        } while (!entradaValida);
    }

    public String obtenerMensajeRespuesta() {
        double resultado = conversion.buscaConversion(monedaBase, monedaObjetivo, cantidad);
        String mensaje = monedaBase.toUpperCase() + " " + cantidad + " equivale a: " + monedaObjetivo.toUpperCase() + " " + resultado;
        System.out.println(mensaje);
        return mensaje;
    }
}
