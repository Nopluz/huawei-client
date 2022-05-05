package hoopluz.huawei.token.bean.request;

import java.util.List;

public class Identity {

	private List<String> methods;

	private Password password;

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public Password getPassword() {
		return password;
	}

}
