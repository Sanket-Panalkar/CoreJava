package maven.com.xworkz.service;

import maven.com.xworkz.dto.PoliceStationDTO;

public interface PoliceStationService {

	boolean validateAndSave(PoliceStationDTO dto);
}
