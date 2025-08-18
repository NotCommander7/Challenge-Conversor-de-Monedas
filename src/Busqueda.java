import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    public Coins buscarTasas (String coinInicial, String coinFinal)  {

        String api = "054c770d07136131b38036e3";
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + api + "/pair/" + coinInicial + "/" + coinFinal);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)  // 054c770d07136131b38036e3/latest/USD
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());



            return new Gson().fromJson(response.body(),Coins.class);


        } catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda") ;
        }





    }



}
