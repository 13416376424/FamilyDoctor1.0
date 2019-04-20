package entity;

public class Doctor {

	//主键ID
	private Integer doctorId;
	//医生微信ID
	private String wechatId;
	//医生姓名
	private String doctorName;
	//医生性别
	private Integer doctorSex;
	//医生年龄
	private Integer doctorAge;
	//个人简介
	private String introduce;
	//证明
	private String prove;
	//医生就职医院
	private String hospital;
	//医生职位
	private String position;
	//服务人数
	private Integer serviceNum;
	
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getWechatId() {
		return wechatId;
	}
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getProve() {
		return prove;
	}
	public void setProve(String prove) {
		this.prove = prove;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(Integer serviceNum) {
		this.serviceNum = serviceNum;
	}
	public Integer getDoctorSex() {
		return doctorSex;
	}
	public void setDoctorSex(Integer doctorSex) {
		this.doctorSex = doctorSex;
	}
	public Integer getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", wechatId=" + wechatId + ", doctorName=" + doctorName + ", doctorSex="
				+ doctorSex + ", doctorAge=" + doctorAge + ", introduce=" + introduce + ", prove=" + prove
				+ ", hospital=" + hospital + ", position=" + position + ", serviceNum=" + serviceNum + "]";
	}
}
