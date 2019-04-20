package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.MedicalHistory;

public interface MedicalHistoryMapper {

	// 添加病历
	@Insert("INSERT INTO medical_history(patient_id,doctor_id,ill_name,time,illness_info,medicine,price,evaluate)"
			+ " VALUES(#{patientId},#{doctorId},#{illName},#{time},#{illnessInfo},#{medicine},#{price},#{evaluate})")
	int addMedicalHistory(MedicalHistory medicalHistory);

	// 更新病历信息
//	@Update("UPDATE medical_history SET  WHERE id = #{patientId}")
//	int updateMedicalHistory(MedicalHistory medicalHistory);

	// 获取患者病历信息
	@Select("SELECT * FROM medical_history WHERE patient_id = #{arg0}")
	List<Map<String, Object>> selectMedicalHistory(Integer patientId);
}
