package hoopluz.huawei;


import hoopluz.huawei.token.TokenApi;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BaseRequest {

	private final RestTemplate restTemplate;

	private final TokenApi tokenApi;

	public BaseRequest(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		this.tokenApi = new TokenApi(restTemplate);
	}

	public <T> T get(String url, Object body, Class<T> responseType) {
		return this.request(url, body, HttpMethod.GET, responseType).getBody();
	}

	public <T> T get(String url, Class<T> responseType) {
		return this.request(url, null, HttpMethod.GET, responseType).getBody();
	}

	public <T> T post(String url, Object body, Class<T> responseType) {
		return this.request(url, body, HttpMethod.POST, responseType).getBody();
	}

	public <T> T delete(String url, Class<T> responseType) {
		return this.request(url, null, HttpMethod.DELETE, responseType).getBody();
	}

	public <T> ResponseEntity<T> request(String url, Object body, HttpMethod method, Class<T> responseType) {
		String token = this.tokenApi.getToken(
			"hoopluz",
			"Hoopluz2",
			"hoopluz"
		);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("X-Auth-Token", token);

		System.out.println(getUrl(url));

		ResponseEntity<T> exchange = this.restTemplate.exchange(
			getUrl(url),
			method,
			new HttpEntity<>(body, httpHeaders),
			responseType
		);

		return exchange;
	}

	public static String getUrl(String url) {
//		return String.format("%s/%s", "https://iam.cn-east-3.myhuaweicloud.com", url);
		return String.format("%s/%s", "https://rtc-api.myhuaweicloud.com", url);
	}

}
