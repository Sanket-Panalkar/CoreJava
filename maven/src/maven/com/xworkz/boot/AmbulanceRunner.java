package maven.com.xworkz.boot;

import java.time.LocalDate;
import java.util.Date;

import maven.com.xworkz.dto.AmbulanceDTO;
import maven.com.xworkz.repository.AmbulanceRepo;
import maven.com.xworkz.repository.AmbulanceRepoImpl;
import maven.com.xworkz.service.AmbulanceServiceImpl;
import maven.com.xworkz.service.AmbulenceService;

public class AmbulanceRunner {

	public static void main(String[] args) {
		
		AmbulanceRepo repo = new AmbulanceRepoImpl();
		AmbulenceService service = new AmbulanceServiceImpl(repo);
		
		AmbulanceDTO ambulanceDTO1 = new AmbulanceDTO(101,325,123654,"shridher",LocalDate.now(),"kumar",LocalDate.now());
		AmbulanceDTO ambulanceDTO2 = new AmbulanceDTO(102,355,156654,"vinayak",LocalDate.now(),"annesh",LocalDate.now());

		boolean save = service.ValidateAndSave(ambulanceDTO1);
		
		
	}
}
