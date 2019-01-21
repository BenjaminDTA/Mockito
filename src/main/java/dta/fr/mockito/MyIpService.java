package dta.fr.mockito;

import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;

public class MyIpService {
	private HttpDataService httpDataService;

	public MyIpService(HttpDataService httpDataService) {
		this.setHttpDataService(httpDataService);
	}
	

	public String getMyIp() throws IOException {
		Gson gson = new Gson();
		String jsonIp = httpDataService.getJsonIp();
		Map<String, String> map = gson.<Map<String, String>>fromJson(jsonIp, Map.class);
		return map.get("ip").split(",")[0];
		}

	public HttpDataService getHttpDataService() {
		return httpDataService;
	}

	public void setHttpDataService(HttpDataService httpDataService) {
		this.httpDataService = httpDataService;
	}
}