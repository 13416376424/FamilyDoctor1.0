package service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import entity.Doctor;
import entity.Patient;

public interface PatientService {

	int addPatient(Patient patient);
	int updatePatient(Patient patient);
	Patient getPatient(String wechatId);
	Doctor getPersonalDoctor(Long patientId);
	boolean changePersonalInfo(Patient patient) throws Exception;  //String pID, String pName, String pPhone, String address
	List<Map<String, Object>> getMedicalHistory(Integer patientId);
	String getAttention(Integer patientId);
	boolean addDoctor(Integer patientId, Integer doctorId);
	boolean deleteDoctor(String pID, String dID);
	boolean changeDoctor(String pID, String dID);
	boolean appointDoctor(String pID, Date time);
	boolean consultDoctor(String pID, String question);
	boolean evaluateDoctor(String pID, String comment);
}
