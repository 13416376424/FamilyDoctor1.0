package entity;

public class Patient {

	//主键ID
	private Integer patientId;
	//患者微信号
	private String wechatId;
	//患者姓名
	private String patientName;
	//患者性别
	private Integer sex;
	//患者年龄
	private Integer age;
	//患者身份证号
	private String identityNum;
	//家庭住址
	private String address;
	//联系方式
	private String phoneNum;
	//个人注意事项
	private String attention;
	
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getWechatId() {
		return wechatId;
	}
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAttention() {
		return attention;
	}
	public void setAttention(String attention) {
		this.attention = attention;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getIdentityNum() {
		return identityNum;
	}
	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", wechatId=" + wechatId + ", patientName=" + patientName + ", sex="
				+ sex + ", age=" + age + ", identityNum=" + identityNum + ", address=" + address + ", phoneNum="
				+ phoneNum + ", attention=" + attention + "]";
	}
}
