package com.example.ms25.service;

import com.example.ms25.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Component
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
//@PostConstruct
   // public void listByQueryMethod(){
      //  studentRepository.findByFirstName("Amin")
            //    .stream()
           //     .forEach(System.out::println);
  //  studentRepository.findByFirstNameAndLastName("20","Qurbanov")
         //   .stream()
          //  .forEach(System.out::println);
 //  }
  // @PostConstruct

  //  public void jpql(){
   // studentRepository.findStudentWithJpql("Amin","Qurbanov")
            //.stream()
           // .forEach(System.out::println);
  // }
   //@PostConstruct
   // public void sql(){
    //   studentRepository.findStudentWithSql(null, "Qurbanov")
        //       .stream()
           //    .forEach(System.out::println);
        
//   }
public String params(String firstName, String lastName, Integer age) {
    studentRepository.findStudentWithParams(null, "Qurbanov", 20)
            .forEach(System.out::println);
    return studentRepository.findStudentWithParams(firstName, lastName, age).toString();
}

}
