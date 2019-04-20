package service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Doctor;
import entity.Patient;
import mapper.MedicalHistoryMapper;
import mapper.PatientMapper;
import service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientMapper patientMapper;

	@Autowired
	private MedicalHistoryMapper medicalHistoryMapper;

	@Override
	public boolean changePersonalInfo(Patient patient) throws Exception {
		Integer patientId = patient.getPatientId();
		Patient patientFromDB = patientMapper.selectPatientById(patientId);
		if (patientFromDB == null) {
			throw new Exception("该患者不存在或该患者未注册！");
		}
		if (patient.getPatientName() != null && !"".equals(patient.getPatientName().trim())) {
			patientFromDB.setPatientName(patient.getPatientName());
		}
		if (patient.getAddress() != null && !"".equals(patient.getAddress().trim())) {
			patientFromDB.setAddress(patient.getAddress());
		}
		if (patient.getSex() != null) {
			patientFromDB.setSex(patient.getSex());
		}
		if (patient.getAge() != null) {
			patientFromDB.setAge(patient.getAge());
		}
		if (patient.getIdentityNum() != null && !"".equals(patient.getIdentityNum())) {
			patientFromDB.setIdentityNum(patient.getIdentityNum());
		}
		if (patient.getPhoneNum() != null && !"".equals(patient.getPhoneNum())) {
			patientFromDB.setPhoneNum(patient.getPhoneNum());
		}
		int update = patientMapper.updatePatient(patientFromDB);
		return update > 0 ? true : false;
	}

	@Override
	public List<Map<String, Object>> getMedicalHistory(Integer patientId) {
		List<Map<String, Object>> medicalRecord = medicalHistoryMapper.selectMedicalHistory(patientId);
		return medicalRecord;
	}

	@Override
	public String getAttention(Integer patientId) {

		return null;
	}

	// 添加家庭医生
	@Override
	public boolean addDoctor(Integer patientId, Integer doctorId) {

		return false;
	}

	// 删除家庭医生
	@Override
	public boolean deleteDoctor(String pID, String dID) {
		// TODO Auto-generated method stub
		return false;
	}

	// 更换家庭医生
	@Override
	public boolean changeDoctor(String pID, String dID) {
		// TODO Auto-generated method stub
		return false;
	}

	// 预约医生
	@Override
	public boolean appointDoctor(String pID, Date time) {
		// TODO Auto-generated method stub
		return false;
	}

	// 咨询医生
	@Override
	public boolean consultDoctor(String pID, String question) {
		// TODO Auto-generated method stub
		return false;
	}

	// 评价医生
	@Override
	public boolean evaluateDoctor(String pID, String comment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addPatient(Patient patient) {
		// 先从数据库中找该患者之前是否登录过
		Patient patientFromDB = patientMapper.selectPatient(patient.getWechatId());
		if (patientFromDB == null) {

		}
		return 0;
	}

	@Override
	public int updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 获取个人信息
	@Override
	public Patient getPatient(String wechatId) {
		// 先从数据库中找该患者之前是否登录过
		Patient patientFromDB = patientMapper.selectPatient(wechatId);
		if (patientFromDB == null) {
			//该患者之前没有登录过，添加到数据库
			Patient patient = new Patient();
			patient.setWechatId(wechatId);
			patientMapper.addPatient(patient);
			return patient;
		}else{
			//该患者之前登录过，返回个人信息
			return patientFromDB;
		}
	}

	//获取个人家庭医生
	@Override
	public Doctor getPersonalDoctor(Long patientId) {
		// TODO Auto-generated method stub
		return patientMapper.selectPersonalDoctor(patientId);
	}

}
