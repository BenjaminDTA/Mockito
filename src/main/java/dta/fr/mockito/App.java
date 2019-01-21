package dta.fr.mockito;

import org.slf4j.LoggerFactory;

import java.io.IOException;

import org.slf4j.Logger;

public class App 
{
	private static final Logger Logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws IOException {
    	
    	HttpDataService hds = new HttpDataService();
    	Logger.info((hds.getJsonIp()));
    }
}
