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
    public void positiveTestfilm() throws URISyntaxException, IOException {

         HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                 PropertiesReader.getProperty("setHost","pos"),
                 PropertiesReader.getProperty("filmPath","pos"));
         Assert.assertEquals(200, response.getStatusLine().getStatusCode());
     }
    @Test
    public void negativeTest1film() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("filmPath",""));
        Assert.assertEquals(404, response.getStatusLine().getStatusCode());

    }@Test
    public void negativeTest2film() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("filmPath",""));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());

    }@Test
    public void positiveTestpeople() throws URISyntaxException, IOException {

        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("peoplePath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    @Test
    public void negativeTest1people() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("peoplePath",""));
        Assert.assertEquals(404, response.getStatusLine().getStatusCode());

    }@Test
    public void negativeTest2people() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("peoplePath",""));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());

    }
    @Test
    public void positiveTestLukeS() throws URISyntaxException, IOException {

        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("lukeSPath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    @Test
    public void negativeTest1LukeS() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("lukeSPath",""));
        Assert.assertEquals(404, response.getStatusLine().getStatusCode());

    }@Test
    public void negativeTest2LukeS() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("lukeSPath",""));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());

    }
    @Test
    public void positiveTestvehicle() throws URISyntaxException, IOException {

        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("vehiclesPath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    @Test
    public void negativeTest1vehicle() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("vehiclesPath",""));
        Assert.assertEquals(404, response.getStatusLine().getStatusCode());

    }@Test
    public void negativeTest2vehicle() throws URISyntaxException, IOException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme",""),
                PropertiesReader.getProperty("setHost",""),PropertiesReader.getProperty("vehiclesPath",""));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());

    }
}
