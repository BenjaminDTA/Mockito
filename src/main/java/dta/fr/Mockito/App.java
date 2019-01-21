package dta.fr.Mockito;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class App 
{
	private static final Logger Logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
    	
    	HttpDataService hds = new HttpDataService();
    	Logger.info((hds.getJsonIp()));
    }
}
