package calculos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



/**
 * @author Mariana Toro
 */
public class API_Conversor {
    double req_result;

    public double getReq_result() {
        return req_result;
    }
    
    public void sendHttpGETRequest(String jBoxConvertirDe, String jBoxConvertirA, double valorAConvertir) throws IOException {
        
        try {
            String url_str = "https://api.exchangerate.host/convert?from=" + jBoxConvertirDe + "&to=" + jBoxConvertirA + "&amount=" + valorAConvertir + "&places=2";
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            this.req_result = jsonobj.get("result").getAsDouble();
        }catch (MalformedURLException e){
            
        }

    }

}
