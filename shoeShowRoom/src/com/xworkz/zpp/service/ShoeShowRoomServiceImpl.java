package com.xworkz.zpp.service;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.stereotype.Component;
import com.xworkz.zpp.dto.ShoeShowRoomDTO;
import com.xworkz.zpp.repository.ShoeShowRoomRepo;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowRoomServiceImpl implements shoeShowRoomService {

	private ShoeShowRoomRepo repo;
	private Validator validator;

	@Override
	public boolean ValidateAndSave(ShoeShowRoomDTO dto) {
		System.out.println("running validate and save method.....");
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<ShoeShowRoomDTO>> constraintvalidation = this.validator.validate(dto);

			System.out.println("Total validation :" + constraintvalidation.size());
			if (!constraintvalidation.isEmpty()) {
				constraintvalidation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
			} else {
				return this.repo.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}