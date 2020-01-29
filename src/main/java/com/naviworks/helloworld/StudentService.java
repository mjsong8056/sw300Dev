package com.naviworks.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 스프링이 관리하는 서비스이다
public class StudentService
{
    private StudentRepository sr;

    public StudentRepository getSr() {
        return sr;
    }

    @Autowired // 스프링이 보다가 적재적소에 Bean을 넣어줌. 얘를 쉐어함
    public void setSr(StudentRepository sr) {
        this.sr = sr;
    }

    public Student joinStudent(Student student)
    {


        return student;
    }
}
