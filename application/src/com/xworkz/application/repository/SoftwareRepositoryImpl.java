package com.xworkz.application.repository;

import com.xworkz.application.dto.SoftwareDTO;

public class SoftwareRepositoryImpl implements SoftwareRepository {

	private SoftwareDTO[] software = new SoftwareDTO[4];
	private int softindex = 0;

	@Override
	public boolean save(SoftwareDTO repo) {

		System.out.println("running in a save softwareDto :" + repo);

		if (softindex < software.length) {
			software[softindex] = repo;
			softindex++;
			System.out.println("saving software at index");
			return true;
		} else {
			System.err.println("element is not save at software in index");
		}
		return false;

	}

	public boolean isExist(SoftwareDTO dto) {
		if (softindex == 0) {
			System.out.println("first element no need  not to check");
			return false;
		} else {
			System.out.println("first element is already exist");
			for (int index = 0; index < software.length; index++) {
				SoftwareDTO ref = this.software[index];
				if (ref.equals(dto)) {
					System.out.println("dto is exist");
				} else {
					System.out.println("dto is not exist");
				}
			}
		}
		return false;
	}

	public SoftwareDTO findById(int id) {
		for (int index = 0; index < this.software.length; index++) {

			SoftwareDTO ref = this.software[index];
			if (ref.getId() == id) {
				System.out.println("dto is found for id:" + id);
				return ref;
			}
		}

		return null;
	}

	@Override
	public SoftwareDTO findBYName(String name) {
		for (int index = 0; index < this.software.length; index++) {
			SoftwareDTO ref1 = this.software[index];
			if (ref1.getName().equals(name)) {
				System.out.println("dto is found for name:" + name);
				return ref1;
			}
		}
		return SoftwareRepository.super.findBYName(name);
	}

	@Override
	public SoftwareDTO findBYNameAndId(String name, int id) {

		return SoftwareRepository.super.findBYNameAndId(name, id);
	}

}
