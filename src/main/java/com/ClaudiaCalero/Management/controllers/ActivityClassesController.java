package com.ClaudiaCalero.Management.controllers;

import com.ClaudiaCalero.Management.exceptions.ActivityClassesNullException;
import com.ClaudiaCalero.Management.exceptions.ActivityClassesServiceException;
import com.ClaudiaCalero.Management.entities.ActivityClasses;
import com.ClaudiaCalero.Management.services.ActivityClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ActivityClassesController {
    @Autowired
    ActivityClassesService activityClassesService;

    @GetMapping
    public List<ActivityClasses> getActivityClasses() {
        List<ActivityClasses> activityClasses;
        try {
            activityClasses = activityClassesService.getAllClasses();
        } catch (ActivityClassesServiceException e) {
            throw new ActivityClassesServiceException("Activity Class Service Exception: " + e);
        }
        return activityClasses;
    }

    @PostMapping
    @ResponseBody
    public ActivityClasses createActivityClasses(@RequestBody ActivityClasses activityClasses) {
        try {
            if (activityClasses.getName() == null || activityClasses.getStart_date() == null || activityClasses.getEnd_date() == null)
                throw new ActivityClassesNullException("The request has invalid class name or dates. Check fields.");
            activityClassesService.save(activityClasses);
        } catch (ActivityClassesServiceException e) {
            throw new ActivityClassesServiceException("Activity Class Service Exception: " + e);
        }
        return activityClasses;

    }
}