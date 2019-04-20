package service;

import java.util.List;
import java.util.Map;

import entity.MedicalHistory;

public interface MedicalHistoryService {

	int addMedicalHistory(MedicalHistory medicalHistory);
	List<Map<String, Object>> selectMedicalHistory(Integer patientId);
}
