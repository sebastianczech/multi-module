package com.sebastiaczech.webapp.repository;

import com.sebastiaczech.webapp.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel, String> {

    StudentModel findById(Long id);

}
