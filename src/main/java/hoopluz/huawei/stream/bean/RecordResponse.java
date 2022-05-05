package hoopluz.huawei.stream.bean;

public class RecordResponse {

	public static final String STATUS_INIT = "INIT";

	public static final String STATUS_RUNNING = "RUNNING";

	public static final String STATUS_STOPPED = "STOPPED";

	private String job_id;

	private String state;

	public static String getStatusInit() {
		return STATUS_INIT;
	}

	public static String getStatusRunning() {
		return STATUS_RUNNING;
	}

	public static String getStatusStopped() {
		return STATUS_STOPPED;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
}
