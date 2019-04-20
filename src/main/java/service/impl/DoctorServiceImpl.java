package service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Application;
import entity.Doctor;
import mapper.ApplicationMapper;
import mapper.DoctorMapper;
import service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorMapper doctorMapper;
	@Autowired
	private ApplicationMapper applicationMapper;
	
	//查询所有医生
	@Override
	public List<Map<String, Object>> getAll(){
		return doctorMapper.getAllDoctors();
	}

	@Override
	public List<Map<String, Object>> getPatients(String dID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editRecord(String dID, String pID, String record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirmAppointment(String dID, String pID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editAttention(String dID, String pID, String attention) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean answerQuestion(String dID, String questionID, String answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveDoctor(Doctor doctor) {
		return doctorMapper.addDoctor(doctor) >= 1 ? true : false;
	}

	@Override
	public int deleteDoctor(Long dID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer applicationForDoctor(Application application) {
		return applicationMapper.addApplication(application);
		
	}
}
