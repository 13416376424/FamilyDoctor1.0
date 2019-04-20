package entity;

import java.util.Date;

//病历
public class MedicalHistory {

	//主键ID
	private Integer keyId;
	//患者ID
	private Integer patientId;
	//看病医生
	private Integer doctorId;
	//患病名称
	private String illName;
	//看病日期
	private Date time;
	//病历内容
	private String illnessInfo;
	//药物
	private String medicine;
	//看病花费
	private Float price;
	//评价
	private String evaluate;
	
	public Integer getKeyId() {
		return keyId;
	}
	public void setKeyId(Integer keyId) {
		this.keyId = keyId;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getIllName() {
		return illName;
	}
	public void setIllName(String illName) {
		this.illName = illName;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getIllnessInfo() {
		return illnessInfo;
	}
	public void setIllnessInfo(String illnessInfo) {
		this.illnessInfo = illnessInfo;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	@Override
	public String toString() {
		return "MedicalHistory [keyId=" + keyId + ", patientId=" + patientId + ", doctorId=" + doctorId + ", illName="
				+ illName + ", time=" + time + ", illnessInfo=" + illnessInfo + ", medicine=" + medicine + ", price="
				+ price + ", evaluate=" + evaluate + "]";
	}
	
}
