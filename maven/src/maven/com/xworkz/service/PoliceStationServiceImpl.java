package maven.com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import maven.com.xworkz.dto.PoliceStationDTO;
import maven.com.xworkz.repository.PoliceStationRepo;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationRepo repo;

	public PoliceStationServiceImpl(PoliceStationRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		System.out.println("running validateAndSave......");

		if (dto != null) {
			System.out.println("dto is not null we can save.." + dto);
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<PoliceStationDTO>> constraintViolation = validator.validate(dto);

			System.out.println("Total validations :" + constraintViolation.size());
			constraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (constraintViolation != null && constraintViolation.isEmpty()) {
				System.out.println("no constraint validation found in dto" + dto);
				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
