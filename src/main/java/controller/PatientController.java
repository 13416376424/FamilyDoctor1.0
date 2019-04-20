package controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Doctor;
import entity.Patient;
import service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	// 添加患者
	@RequestMapping("/addPatient")
	@ResponseBody
	public int addPatient(Patient patient) {
		return patientService.addPatient(patient);
	}

	// 获取个人信息
	@RequestMapping("/getPatient")
	@ResponseBody
	public Patient getPatient(String wechatId) {
		return patientService.getPatient(wechatId);
	}

	// 修改个人信息
	@RequestMapping("/changePersonalInfo")
	@ResponseBody
	public boolean changePersonalInfo(Patient patient) throws Exception { // String
																			// pID,
																			// String
																			// pName,
																			// String
																			// pPhone,
																			// String
																			// address
		if (patient == null) {
			throw new Exception("patient对象为空！");
		}
		if (patient.getPatientId() == null) {
			throw new Exception("patientID为空！");
		}
		return patientService.changePersonalInfo(patient);
	}

	// 查看个人病史
	@RequestMapping("/medicalHistory")
	@ResponseBody
	public List<Map<String, Object>> getMedicalHistory(String patientIdStr) throws Exception {
		if (patientIdStr == null || "".equals(patientIdStr)) {
			throw new Exception("患者ID为空！");
		}
		Integer patientID = Integer.valueOf(patientIdStr);
		return patientService.getMedicalHistory(patientID);
	}

	// 查看个人注意事项
	@RequestMapping("/getAttention")
	@ResponseBody
	public String getAttention(String pID) {
		return pID;
	}

	// 添加家庭医生
	@RequestMapping("/addDoctor")
	@ResponseBody
	public boolean addDoctor(String pID, String dID) {

		return false;
	}

	// 获取个人家庭医生
	@RequestMapping("/getPersonalDoctor")
	@ResponseBody
	public Doctor getPersonalDoctor(Long patientID) {

		 Doctor doctor = patientService.getPersonalDoctor(patientID);
		 System.out.println(doctor);
		 return new Doctor();
	}

	// 删除家庭医生
	@RequestMapping("/deleteDoctor")
	@ResponseBody
	public boolean deleteDoctor(String pID, String dID) {
		return false;
	}

	// 更换家庭医生
	@RequestMapping("/changeDoctor")
	@ResponseBody
	public boolean changeDoctor(String pID, String dID) {
		return false;
	}

	// 预约医生
	@RequestMapping("/appointDoctor")
	@ResponseBody
	public boolean appointDoctor(String pID, Date time) {
		return false;
	}

	// 咨询医生
	@RequestMapping("/consultDoctor")
	@ResponseBody
	public boolean consultDoctor(String pID, String question) {
		return false;
	}

	// 评价医生
	@RequestMapping("/evaluateDoctor")
	@ResponseBody
	public boolean evaluateDoctor(String pID, String comment) {
		return false;
	}
}
