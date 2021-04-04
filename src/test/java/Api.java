import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class Api {

     @Test
    public void positiveTest() throws URISyntaxException, IOException {

         HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                 PropertiesReader.getProperty("setHost","pos"),
                 PropertiesReader.getProperty("filmPath","pos"));
         Assert.assertEquals(200, response.getStatusLine().getStatusCode());

     }
    @Test
    public void negativeTest1() throws URISyntaxException, IOException {

        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("filmPath",""));
        Assert.assertEquals(404, response.getStatusLine().getStatusCode());

    }@Test
    public void negativeTest2() throws URISyntaxException, IOException {

        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("filmPath",""));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());

    }
}
