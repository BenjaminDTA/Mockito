package dta.fr.mockito;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

public class HttpDataService {
	
	public static String url = "http://jsonip.com";

	public String getJsonIp() throws IOException{
		try {
			return Request.Get(url).execute().returnContent().toString();
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
}