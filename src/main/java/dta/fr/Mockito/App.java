package dta.fr.Mockito;


public class App 
{
    public static void main( String[] args )
    {
    	HttpDataService hds = new HttpDataService();
    	MyIpService ip = new MyIpService(hds);
    	System.out.println(hds.getJsonIp());
    }
}
