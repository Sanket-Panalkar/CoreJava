package maven.com.xworkz.boot;

import maven.com.xworkz.constant.Cells;
import maven.com.xworkz.dto.PoliceStationDTO;
import maven.com.xworkz.repository.PoliceStationRepo;
import maven.com.xworkz.repository.PoliceStationRepoImpl;
import maven.com.xworkz.service.PoliceStationService;
import maven.com.xworkz.service.PoliceStationServiceImpl;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStationRepo repo = new PoliceStationRepoImpl();

		PoliceStationService service = new PoliceStationServiceImpl(repo);

		PoliceStationDTO policeDTO1 = new PoliceStationDTO(10, "sanket", "sanket", "nudhol", Cells.FIVE);
		PoliceStationDTO policeDTO2 = new PoliceStationDTO(20, "shridher", "annesh", "bagalkot", Cells.ONE);

		boolean save = service.validateAndSave(policeDTO1);
		

	}
}