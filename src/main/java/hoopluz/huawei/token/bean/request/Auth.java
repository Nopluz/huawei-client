
package hoopluz.huawei.token.bean.request;

public class Auth {

	private Identity identity;

	private Scope scope;

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public Scope getScope() {
		return scope;
	}

}
