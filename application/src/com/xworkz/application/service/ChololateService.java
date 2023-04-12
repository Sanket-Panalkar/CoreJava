package com.xworkz.application.service;

import com.xworkz.application.dto.ChocolateDTO;
import com.xworkz.application.exeception.InvalidDataChocolateExeption;

public interface ChololateService {

	boolean validateAndSave(ChocolateDTO dto) throws InvalidDataChocolateExeption;
}
