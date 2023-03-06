package com.example.doctor.repository;

import com.example.doctor.model.Doctor;
import com.example.doctor.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    List<Patient> findByDoctor(Doctor doctor);
}