package com.example.studentInfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentInfo.entities.StudentInformation;

public interface StudentInformationRepos extends JpaRepository<StudentInformation, Long> {

}
