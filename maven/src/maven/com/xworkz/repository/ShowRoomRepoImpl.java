package maven.com.xworkz.repository;

import java.util.ArrayList;

import java.util.Collection;

import maven.com.xworkz.dto.ShowroomDTO;

public class ShowRoomRepoImpl implements ShowRoomRepo {

	private Collection<ShowroomDTO> repo = new ArrayList<ShowroomDTO>();

	@Override
	public boolean save(ShowroomDTO dto) {

		return this.repo.add(dto);
	}

}
