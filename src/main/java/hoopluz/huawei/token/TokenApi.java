package hoopluz.huawei.token;

import hoopluz.huawei.BaseRequest;
import hoopluz.huawei.token.bean.reponse.AccessToken;
import hoopluz.huawei.token.bean.request.TokenRequestParameter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class TokenApi {

	private final RestTemplate restTemplate;

	private final String TOKEN_KEY = "X-Subject-Token";

	public TokenApi(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String getToken(String username, String password, String domain) {
		ResponseEntity<AccessToken> exchange = this.restTemplate.exchange(
			"https://iam.cn-east-3.myhuaweicloud.com/v3/auth/tokens",
			HttpMethod.POST,
			new HttpEntity<>(TokenRequestParameter.build(username, password, domain)),
			AccessToken.class
		);

		HttpHeaders headers = exchange.getHeaders();
		List<String> tokens = headers.get(TOKEN_KEY);

		if (tokens == null || tokens.isEmpty()) {
			throw new RuntimeException("No token found");
		}

		String token = tokens.get(0);
		System.out.println("getToken: " + token);
		return token;
	}


}
