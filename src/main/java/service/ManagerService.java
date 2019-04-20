package service;

import entity.Application;

public interface ManagerService {

	Application getApplication(Long id);
	boolean handleApplication(Application application);
}
