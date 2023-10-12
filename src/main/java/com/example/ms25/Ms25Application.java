package com.example.ms25;

import com.example.ms25.domain.Student;
import com.example.ms25.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor

public class Ms25Application  implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Ms25Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      //   Student student = Student.builder()
      //         .age(20)
        //       .firstName(null)
        //     .lastName("Qurbanov")
        //   .studentNumber("22")
        // .build();
        //studentRepository.save(student);

    }
}
