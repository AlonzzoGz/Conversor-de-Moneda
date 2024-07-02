import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    private static final String API_KEY = "e7fba827d3e1dc0f7b57aedc";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double buscaConversion(String monedaBase, String monedaObjetivo, double cantidad) {
        try {
            URI uri = URI.create(API_URL + monedaBase);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String json = response.body();
                JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

                double rate = jsonObject.getAsJsonObject("conversion_rates").get(monedaObjetivo).getAsDouble();
                double convertedAmount = cantidad * rate;

                return convertedAmount;
            } else {
                throw new RuntimeException("Error al obtener las tasas de cambio. Código de estado: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al realizar la solicitud HTTP: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
