package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Doctor;

public interface DoctorMapper {

	//获取所有医生
	@Select("SELECT * FROM doctor")
	public List<Map<String, Object>> getAllDoctors();
	
	//获取某个医生关联负责的所有患者
	@Select("SELECT p.* FROM patient p,patient_doctor pd WHERE pd.doctor_id=#{arg0}")
	public List<Map<String, Object>> getPatients(String dID);
	
	//添加医生
	@Insert("INSERT INTO doctor(wechat_id,doctor_name,introduce)"
			+ " VALUES(#{wechatId},#{doctorName},#{introduce})")
	int addDoctor(Doctor doctor);
	
	//删除医生
	@Delete("DELETE FROM doctor WHERE id=#{arg0}")
	int deleteDoctor(Long dID);
	
	//更新医生信息
	@Update("UPDATE doctor SET"
			+ " doctor_name = #{doctorName},"
			+ "sex = #{doctorSex},"
			+ "age = #{doctorAge},"
			+ "introduce = #{introduce},"
			+ "prove = #{prove},"
			+ "hospital = #{hospital},"
			+ "position = #{position},"
			+ "serviceNum = #{serviceNum},"
			+ " WHERE id = #{doctorId}")
	int updateDoctor(Doctor doctor);
}
