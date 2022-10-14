package com.ClaudiaCalero.Management.services;

import com.ClaudiaCalero.Management.repositories.ClassesRepository;
import com.ClaudiaCalero.Management.services.interfaces.ClassesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesService implements ClassesServiceInterface {
    @Autowired
    ClassesRepository classesRepository;
}
