package com.ClaudiaCalero.Management.services;

import com.ClaudiaCalero.Management.entities.ActivityClasses;
import com.ClaudiaCalero.Management.repositories.ActivityClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityClassesService {
    @Autowired
    ActivityClassesRepository activityClassesRepository;

    public void save(ActivityClasses activityClasses) {
            activityClassesRepository.save(activityClasses);
    }

    public List<ActivityClasses> getAllClasses() {
        return activityClassesRepository.findAll();
    }

    public Optional<ActivityClasses> getClassById(int classId) {
        return activityClassesRepository.findById(classId);
    }

}

