package com.example.doctor.service;

import com.example.doctor.repository.DoctorRepository;
import com.example.doctor.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorrepository;
    public Doctor saveDoctor(Doctor doctor) {
        String doctorName = doctor.getDoctorName();
        doctorName = "Dr. " + doctorName;
        doctor.setDoctorName(doctorName);
        return doctorrepository.save(doctor);
    }
    public List<Doctor> getAllDoctors() {
        return doctorrepository.findAll();
    }
    public Doctor getDoctorById(Integer id) {
        return doctorrepository.findById(id).orElse(null);
    }
    public void deleteDoctorById(Integer id) {
        doctorrepository.deleteById(id);
    }
    public Doctor updateDoctor(Doctor updatedDoctor) {
        String doctorName = updatedDoctor.getDoctorName();
        doctorName = "Dr. " + doctorName;
        updatedDoctor.setDoctorName(doctorName);
        return doctorrepository.save(updatedDoctor);
    }
}