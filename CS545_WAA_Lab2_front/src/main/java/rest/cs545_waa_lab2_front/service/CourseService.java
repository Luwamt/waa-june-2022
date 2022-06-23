package rest.cs545_waa_lab2_front.service;

import rest.cs545_waa_lab2_front.dto.CourseDto;

import java.util.List;

public interface CourseService {

    public List<CourseDto> getCoursesByStudentId(int StudentId);

    public List<CourseDto> getAllCourses();
}