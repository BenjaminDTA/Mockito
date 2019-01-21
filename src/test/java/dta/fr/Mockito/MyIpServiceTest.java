package dta.fr.Mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class MyIpServiceTest {
	@Test
	public void test() {
		HttpDataService hds = Mockito.mock(HttpDataService.class);
		
		Mockito.when(hds.getJsonIp()).thenReturn("{\"ip\":\"192.168.1.1\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Support immigrants\"}");
		
		MyIpService myIpService = new MyIpService(hds);
		String ip = myIpService.getMyIp();
		Assert.assertEquals("192.168.1.1", ip);
		Mockito.verify(hds, Mockito.times(1)).getJsonIp();
	}
	
	
	
}
