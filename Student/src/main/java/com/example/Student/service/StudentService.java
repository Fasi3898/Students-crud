package com.example.Student.service;

import com.example.Student.pojo.Student;
import com.example.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public Student saveStudent( Student student){
        return studentRepository.save(student);
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public void deleteStudentById(Long studentId){
         studentRepository.deleteById(studentId);
    }
    public List<String> getStudentByDepartmentId(Long departmentId)
    {
        List<Student> list = studentRepository.findAll();
        List<String> ans=new ArrayList<>();
        for(Student i: list)
        {
            if(i.getDepartmentId()==departmentId)
            {
                ans.add(i.getFirstName()+" "+i.getLastName());
            }
        }
        return ans;
    }
}