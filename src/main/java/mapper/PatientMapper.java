package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Doctor;
import entity.Patient;

public interface PatientMapper {

	// 添加患者
	@Insert("INSERT INTO patient(wechat_id,patient_name,sex,age,identity_num,address,phone_num,attention)"
			+ " VALUES(#{wechatId},#{patientName},#{sex},#{age},#{identityNum},#{address},#{phoneNum},#{attention})")
	int addPatient(Patient patient);

	// 更新患者信息
	@Update("UPDATE patient SET" + " patient_name = #{patientName}," + "sex = #{sex}," + "age = #{age},"
			+ "identity_num = #{identityNum}," + "address = #{address}," + "phone_num = #{phoneNum},"
			+ "attention = #{attention}," + " WHERE id = #{patientId}")
	int updatePatient(Patient patient);

	// 获取患者信息
	@Select("SELECT * FROM patient WHERE wechat_id = #{arg0}")
	Patient selectPatient(String wechatId);

	// 根据ID获取患者信息
	@Select("SELECT * FROM patient WHERE id = #{arg0}")
	Patient selectPatientById(Integer patientId);
	
	//获取患者个人家庭医生
	@Select("SELECT * FROM doctor d,patient_doctor pd WHERE pd.doctor_id=d.id and pd.patient_id=#{patientId}")
	Doctor selectPersonalDoctor(Long patientId);
}
