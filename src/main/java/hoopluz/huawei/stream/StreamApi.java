package hoopluz.huawei.stream;

import hoopluz.huawei.BaseRequest;
import hoopluz.huawei.Response;
import hoopluz.huawei.stream.bean.Record;
import hoopluz.huawei.stream.bean.RecordResponse;
import org.springframework.web.client.RestTemplate;

public class StreamApi extends BaseRequest {

	public StreamApi(RestTemplate restTemplate) {
		super(restTemplate);
	}

	public RecordResponse startRecording(Record record) {
		return this.post(
			"v2/apps/" + record.getAppId() + "/individual-stream-jobs",
			record.toParams(),
			RecordResponse.class
		);
	}

	public RecordResponse getById(String appId, String jobId) {
		return this.get(
			"v2/apps/" + appId + "/individual-stream-jobs/" + jobId,
			RecordResponse.class
		);
	}

	public Response stopRecording(String appId, String jobId) {
		return this.delete(
			"v2/apps/" + appId + "/individual-stream-jobs/" + jobId,
			Response.class
		);
	}

}
