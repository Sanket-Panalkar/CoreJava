package maven.com.xworkz.repository;

import java.util.ArrayList;
import java.util.Collection;

import maven.com.xworkz.dto.AmbulanceDTO;

public class AmbulanceRepoImpl implements AmbulanceRepo {

	Collection<AmbulanceDTO> repoRef = new ArrayList<AmbulanceDTO>();

	@Override
	public boolean save(AmbulanceDTO dto) {

		return this.repoRef.add(dto);
	}

}
