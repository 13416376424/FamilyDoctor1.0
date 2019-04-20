package service;

import java.util.List;
import java.util.Map;

import entity.Application;
import entity.Doctor;

public interface DoctorService {

	List<Map<String, Object>> getAll();
	boolean saveDoctor(Doctor doctor);
	List<Map<String, Object>> getPatients(String dID);
	int deleteDoctor(Long dID);
	int updateDoctor(Doctor doctor);
	boolean editRecord(String dID, String pID, String record);
	boolean confirmAppointment(String dID, String pID);
	boolean editAttention(String dID, String pID, String attention);
	boolean answerQuestion(String dID, String questionID, String answer);
	Integer applicationForDoctor(Application application);
}
