package com.naviworks.helloworld;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> // long은 object 타입이 아니라서 wrapper 한 타입을 넣어줘야 함
{
    public List<Student> findByName(String _name);
}
