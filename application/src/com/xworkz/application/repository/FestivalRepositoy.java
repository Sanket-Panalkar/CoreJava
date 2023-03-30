package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;

public interface FestivalRepositoy {
	boolean save(FestivalDTO dto);
	
	default boolean isExist(FestivalDTO dto) {
		return false;
	}
	
	default int getCount() {
		return 0;
	}
}
