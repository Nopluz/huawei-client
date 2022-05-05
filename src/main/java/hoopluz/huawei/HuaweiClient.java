package hoopluz.huawei;

import hoopluz.huawei.stream.StreamApi;
import hoopluz.huawei.token.TokenApi;
import org.springframework.web.client.RestTemplate;

public class HuaweiClient {

	private final TokenApi tokenApi;

	private final StreamApi streamApi;

	public HuaweiClient(
		final RestTemplate restTemplate
	) {
		this.tokenApi = new TokenApi(restTemplate);
		this.streamApi = new StreamApi(restTemplate);
	}

	public TokenApi getTokenApi() {
		return tokenApi;
	}

	public StreamApi getStreamApi() {
		return streamApi;
	}
}
