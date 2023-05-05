package maven.com.xworkz.service;
import maven.com.xworkz.Util.ValidationUtil;
import maven.com.xworkz.dto.ShowroomDTO;
import maven.com.xworkz.repository.ShowRoomRepo;

public class ShowRoomServiceImpl implements ShowRoomService {

	private ValidationUtil<ShowroomDTO> validate = new ValidationUtil<>();

	private ShowRoomRepo repo;

	public ShowRoomServiceImpl(ShowRoomRepo repo) {

		this.repo = repo;
	}

	@Override
	public boolean ValidateAndSave(ShowroomDTO dto) {

		System.out.println("running validate and save in ShowroomServiceImpl...");

		if (validate.ValidDTO(dto)) {
			System.out.println("dto is not null we can validate the dto");
				return this.repo.save(dto);
			}
		System.out.println("there exists validation and hence will not be saved");
		return false;
	}
}


