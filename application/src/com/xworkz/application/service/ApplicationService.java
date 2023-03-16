package com.xworkz.application.dto.service;

import com.xworkz.application.dto.things.Application;

public interface ApplicationService {

    boolean validateAndSave(Application dto);
    
}
