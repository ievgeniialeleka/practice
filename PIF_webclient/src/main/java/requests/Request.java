package requests;

import org.springframework.web.reactive.function.client.WebClient;

public class Request {

    WebClient client = WebClient.create();

    WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = (WebClient.UriSpec<WebClient.RequestBodySpec>) client.get();

    WebClient.RequestBodySpec bodySpec = uriSpec.uri("https://restcountries.com/v3.1/all");


}
