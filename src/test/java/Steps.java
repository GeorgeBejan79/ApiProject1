import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URISyntaxException;

public class Steps{

    @Given("we are sending url to the server and get the response")
    public void we_are_sending_url_to_the_server_and_get_the_response() throws IOException, URISyntaxException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("filmPath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    @Given("we sending url for peoples")
    public void we_sending_url_for_peoples() throws IOException, URISyntaxException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("peoplePath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }
    @Given("we sending url LukeSkywalker")
    public void we_sending_url_luke_skywalker() throws IOException, URISyntaxException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("lukeSPath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }
    @Given("we sending url for vehicles")
    public void we_sending_url_for_vehicles() throws IOException, URISyntaxException {
        HttpResponse response = Utils.getResponse(PropertiesReader.getProperty("setScheme","pos"),
                PropertiesReader.getProperty("setHost","pos"),
                PropertiesReader.getProperty("vehiclesPath","pos"));
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

}
