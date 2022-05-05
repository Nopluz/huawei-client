
package hoopluz.huawei.token.bean.reponse;

import hoopluz.huawei.token.bean.request.Project;
import hoopluz.huawei.token.bean.request.User;

import java.util.Date;
import java.util.List;

public class Token {

	private List<String> catalog;

	private Date expiresAt;

	private Date issuedAt;

	private List<String> methods;

	private Project project;

	private List<Roles> roles;

	private User user;

	public void setCatalog(List<String> catalog) {
		this.catalog = catalog;
	}

	public List<String> getCatalog() {
		return catalog;
	}

	public Date getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Date getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(Date issuedAt) {
		this.issuedAt = issuedAt;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Project getProject() {
		return project;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

}
