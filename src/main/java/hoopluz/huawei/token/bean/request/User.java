
package hoopluz.huawei.token.bean.request;

public class User {

	private Domain domain;

	private String name;

	private String password;

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
