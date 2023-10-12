package com.example.ms25.repository;

import com.example.ms25.domain.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
@ComponentScan("com.example.ms25.service")
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByFirstName(String amin);

    List<Student> findByFirstNameAndLastName(String amin, String qurbanov);

@Query("Select s from Student s Where s.firstName=?1 AND s.lastName=?2 ")
    List<Student> findStudentWithJpql(String firstName, String lastName);

  @Query(nativeQuery = true, value = "Select * from our_students s WHERE s.first_Name = ?1 AND s.last_Name = ?2")
    List<Student> findStudentWithSql(String amin, String qurbanov);
    @Query(value = "select s from Student s where (:firstName is null or s.firstName =:firstName)" +
            "and (:secondName is null or s.lastName =:lastName)" +
            "and (:age is null or s.age =:age)")
    List<Student> findStudentWithParams(
            @Param(value = "firstName") String firstName,
            @Param(value = "lastName") String lastName,
            @Param(value = "age") Integer age);
}