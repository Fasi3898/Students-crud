package com.example.Student.controller;

import com.example.Student.pojo.Student;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    @ResponseBody
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/get")
    @ResponseBody
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public  String deleteStudentById(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
        return "deleted successfully";
    }
    @GetMapping("/{departmentId}")
    @ResponseBody
    public List<String> getStudentByDepartmentId(@PathVariable("departmentId") Long departmentId){
        return studentService.getStudentByDepartmentId(departmentId);
    }
}
