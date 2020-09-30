package org.elec5619.peerhelping.controller;

import org.elec5619.peerhelping.domain.CoursesEntity;
import org.elec5619.peerhelping.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CoursesController {
    @Autowired
    CoursesService coursesService;

    // Dynamic URI using REST standards
    @GetMapping("/courses/{courseId}")
    public CoursesEntity findCourse(@PathVariable int courseId){
        return this.coursesService.findByCourseId(courseId);
    }

    //TODO: to be updated
}