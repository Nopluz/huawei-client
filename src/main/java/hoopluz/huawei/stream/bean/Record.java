package hoopluz.huawei.stream.bean;

import java.util.HashMap;
import java.util.Map;

public class Record {

	private String appId;

	private String roomId;

	private String userId;

	private String ruleId;

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Map<String, Object> toParams() {
		HashMap<String, Object> objectObjectHashMap = new HashMap<>();
		HashMap<String, String> recordParam = new HashMap<>();
		recordParam.put("record_rule_id", ruleId);

		objectObjectHashMap.put("room_id", roomId);
		objectObjectHashMap.put("user_id", userId);
		objectObjectHashMap.put("video_type", "CAMERASTREAM");
		objectObjectHashMap.put("is_record_audio", true);
		objectObjectHashMap.put("select_stream_type", "FHD");
		objectObjectHashMap.put("record_param", recordParam);

		return objectObjectHashMap;
	}

}
