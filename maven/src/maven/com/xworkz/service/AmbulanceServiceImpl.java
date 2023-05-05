package maven.com.xworkz.service;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import maven.com.xworkz.dto.AmbulanceDTO;
import maven.com.xworkz.repository.AmbulanceRepo;

public class AmbulanceServiceImpl implements AmbulenceService{

	private AmbulanceRepo repo ;
	
	public AmbulanceServiceImpl(AmbulanceRepo repo) {

		this.repo = repo;
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

	}
	
	
	Collection<AmbulanceDTO> serviceRef = new ArrayList<AmbulanceDTO>(); 
	
	@Override
	public boolean ValidateAndSave(AmbulanceDTO dto) {
		System.out.println("running ValidateAndSave in Ambulance service-Impl");
		if(dto!=null) {
		System.out.println("Dto is not null we can save");
			
			
			
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator(); 

			Set<ConstraintViolation<AmbulanceDTO>> ConstraintViolation = validator.validate(dto);
			
			System.out.println("Total number of violations: " +ConstraintViolation.size()); 
			ConstraintViolation.forEach(cv->System.out.println(cv.getPropertyPath()+" "+cv.getMessage()));
			
			if(ConstraintViolation != null && ConstraintViolation.isEmpty()){
				System.out.println("no constraint violation in dto"+dto);
				return this.repo.save(dto);
			}
			
		}else {
			System.out.println("dto is null");
		}
		return false;
	}

}
