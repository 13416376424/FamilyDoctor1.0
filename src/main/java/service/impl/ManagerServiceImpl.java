package service.impl;

import org.springframework.stereotype.Service;

import entity.Application;
import service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Override
	public boolean handleApplication(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Application getApplication(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
