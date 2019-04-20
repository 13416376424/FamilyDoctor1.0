package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Application;
import entity.Doctor;
import service.DoctorService;
import net.sf.json.JSONObject;
@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	// 资质申请认证
	@RequestMapping("/applyForDoctor")
	@ResponseBody
	public Map<String, Integer> applyForDoctor(Application application) {
		Integer id = doctorService.applicationForDoctor(application);
		Map<String, Integer> result = new HashMap<String, Integer>();
		result.put("id", id);
		return result;

	}

	// 上传图片
	@RequestMapping("/uploadPictures")
	@ResponseBody
	public Integer uploadPictures(HttpServletRequest request) {
		System.out.println(request);
		return null;

//		if (request instanceof MultipartHttpServletRequest) {
//			MultipartHttpServletRequest mulRequest = (MultipartHttpServletRequest) request;
//			Set<Map.Entry<String, MultipartFile>> set = mulRequest.getFileMap().entrySet();
//			String branchStr = mulRequest.getParameter("object");
//			BranchPoint branchPoint;
//			try {
//				branchPoint = omapper.readValue(branchStr, BranchPoint.class);
//			} catch (IOException e) {
//				return new ResponseObj(false, new Error("数据格式不正确"));
//			} // 网点名称唯一 // BranchPoint sameBranchPoint =
//				// companyMapper.getSmaneBranchPointName(branchPoint.getBranchName());
//				// // if (null != sameBranchPoint) { // if
//				// (!isEmpty(sameBranchPoint.getBranchName()) && //
//				// branchPoint.getBranchName().equals(sameBranchPoint.getBranchName()))
//				// { // return new ResponseObj(false, new Error("网点名称" +
//				// "已经存在")); // } // } String photoId =
//				// UUID.randomUUID().toString();branchPoint.setPhoto(photoId);branchPoint.setCreateTime(getNowTime());companyMapper.insertBranchPoint(branchPoint);
//				// for (Map.Entry<String, MultipartFile> each : set) { String
//				// name = each.getValue().getOriginalFilename(); String suffixal
//				// = getSuffixal(name); try {writeToLocal(photoId + suffixal,
//				// each.getValue().getInputStream());} catch (IOException e)
//				// {e.printStackTrace(); return new ResponseObj(false, new
//				// Error("文件保存失败"));}}} return new ResponseObj(true, null);
//		}

	}

	// 添加医生
	@RequestMapping("/saveDoctor")
	@ResponseBody
	public boolean saveDoctor(Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}

	@RequestMapping("/removeDoctor")
	@ResponseBody
	public boolean removeDoctor(Long dID) {
		return true;
	}

	// 获取医生列表
	@RequestMapping("/getAllDoctor")
	@ResponseBody
	public List<Map<String, Object>> selectAllDoctor() {
		return doctorService.getAll();
	}

	// 查看患者信息
	@RequestMapping("/getPatients")
	@ResponseBody
	public List<Map<String, Object>> getPatients(String dID) {
		return doctorService.getPatients(dID);
	}

	// 编辑患者病历
	@RequestMapping("/editRecord")
	@ResponseBody
	public boolean editRecord(String dID, String pID, String record) {
		return doctorService.editRecord(dID, pID, record);
	}

	// 确认预约信息
	@RequestMapping("/confirmAppointment")
	@ResponseBody
	public boolean confirmAppointment(String dID, String pID) {
		return doctorService.confirmAppointment(dID, pID);
	}

	// 编辑患者注意事项
	@RequestMapping("/editAttention")
	@ResponseBody
	public boolean editAttention(String dID, String pID, String attention) {
		return doctorService.editAttention(dID, pID, attention);
	}

	// 答疑
	@RequestMapping("/answerQuestion")
	@ResponseBody
	public boolean answerQuestion(String dID, String questionID, String answer) {
		return doctorService.answerQuestion(dID, questionID, answer);
	}

	@RequestMapping("/springboot")
	@ResponseBody
	public String sp() {
		System.out.println("printout");
		return "springboot";
	}
}
