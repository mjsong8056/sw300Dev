package com.naviworks.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students") // REST 규격 상 복수형이 좋음
public class StudentController
{
    StudentService ss;

    public StudentService getSs() {
        return ss;
    }

    @Autowired
    public void setSs(StudentService ss) {
        this.ss = ss;
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void joinStudent(@RequestBody Student _student) // RequestBody 안에 Jsonparser가 있음
    {
        ss.joinStudent(_student);
    }

//    @RequestMapping(value = "/find", method = RequestMethod.POST)
//    public void findStudent(String _name)
//    {
//        ss.findStudent(_name);
//    }@RequestMapping(value = "/find", method = RequestMethod.POST)
////    public void findStudent(String _name)
////    {
////        ss.findStudent(_name);
////    }
}
