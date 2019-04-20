package entity;

public class Manager {

	//主键ID
	private Integer managerId;
	//用户名
	private String userName;
	//密码
	private String password;
	//管理员姓名
	private String managerName;
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", userName=" + userName + ", password=" + password
				+ ", managerName=" + managerName + "]";
	}
}
