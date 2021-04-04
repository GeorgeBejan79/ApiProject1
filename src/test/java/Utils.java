import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

public class Utils {
    public static HttpResponse getResponse(String scheme, String host, String path) throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder();
        builder.setScheme(scheme);
        builder.setHost(host);
        builder.setPath(path);

        HttpGet get = new HttpGet(builder.build());
        get.setHeader("Accept", "application/json");
        return client.execute(get);
    }
}
