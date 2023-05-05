package maven.com.xworkz.boot;

import java.time.LocalDate;


import maven.com.xworkz.constant.Locations;
import maven.com.xworkz.dto.ShowroomDTO;
import maven.com.xworkz.repository.ShowRoomRepo;
import maven.com.xworkz.repository.ShowRoomRepoImpl;
import maven.com.xworkz.service.ShowRoomService;
import maven.com.xworkz.service.ShowRoomServiceImpl;

public class ShowRoomRunner {

	public static void main(String[] args) {
		ShowroomDTO dto = new ShowroomDTO(1, "Honda", Locations.RAJAJINAGAR, 994552, LocalDate.of(2020, 11, 11), false);

		ShowRoomRepo repo = new ShowRoomRepoImpl();
		ShowRoomService roomService = new ShowRoomServiceImpl(repo);
		boolean save = roomService.ValidateAndSave(dto);
		System.out.println("Saved:" + save);

	}

}
