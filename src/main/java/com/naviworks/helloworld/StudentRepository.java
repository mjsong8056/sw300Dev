package com.naviworks.helloworld;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>
{

}
