package controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Application;
import service.DoctorService;
import service.ManagerService;

@Controller
public class ManagerController {

	@Autowired
	private DoctorService doctorService;
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping("/toHome")
	@ResponseBody
	public String toHome(){
		return "admin/home.jsp";
	}
	
	@RequestMapping("/managerLogin")
	@ResponseBody
	public boolean login(String json){
		return true;
	}
	
	public String getDoctors(HttpServletRequest request){
		List<Map<String, Object>> doctorsList = doctorService.getAll();
		request.setAttribute("doctorsList", doctorsList);
		return "admin/listDoctors.jsp";
	}
	
	//获取医生申请
	public Application getApplication(Long id){
		return managerService.getApplication(id);
	}
	
	//处理医生申请
	public boolean handleApplication(Application application){
		return managerService.handleApplication(application);
	}
}
