package maven.com.xworkz.repository;

import java.util.ArrayList;

import java.util.Collection;

import maven.com.xworkz.dto.PoliceStationDTO;

public class PoliceStationRepoImpl implements PoliceStationRepo {

	private Collection<PoliceStationDTO> repo = new ArrayList<PoliceStationDTO>();

	@Override
	public boolean save(PoliceStationDTO dto) {

		return this.repo.add(dto);
	}

}
