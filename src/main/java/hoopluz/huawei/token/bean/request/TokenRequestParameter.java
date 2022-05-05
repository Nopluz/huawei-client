package hoopluz.huawei.token.bean.request;

import java.util.ArrayList;

public class TokenRequestParameter {

	private Auth auth;

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Auth getAuth() {
		return auth;
	}

	public static TokenRequestParameter build(String username, String password, String domain) {

		TokenRequestParameter tokenRequestParameter = new TokenRequestParameter();

		Domain userDomain = new Domain();
		userDomain.setName(domain);

		User user = new User();
		user.setName(username);
		user.setPassword(password);
		user.setDomain(userDomain);

		Password pwd = new Password();
		pwd.setUser(user);

		Identity identity = new Identity();
		identity.setPassword(pwd);

		ArrayList<String> methods = new ArrayList<>();
		methods.add("password");
		identity.setMethods(methods);

		Auth auth = new Auth();
		auth.setIdentity(identity);
		tokenRequestParameter.setAuth(auth);

		return tokenRequestParameter;
	}


}
