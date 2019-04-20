package entity;

//医生申请表实体
public class Application {

	//主键
	private Long id;
	
	//医生姓名
	private String name;
	
	//性别
	private Integer sex;
	
	//医生头像照片
	private String photo;
	
	//医生证书照片
	private String credential;
	
	//手机号
	private String phoneNum;
	
	//身份证号
	private String idNumber;
	
	//所在医院
	private String hospital;
	
	//职位
	private String position;
	
	//介绍
	private String introduce;
	
	//是否已处理该申请
	private int isHandle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
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

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getIsHandle() {
		return isHandle;
	}

	public void setIsHandle(int isHandle) {
		this.isHandle = isHandle;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
}
