package com.example.examportal.service;


import com.example.examportal.dto.FacultyRequestDTO;
import com.example.examportal.dto.FacultyResponseDTO;
import com.example.examportal.dto.StudentResponseDTO;
import com.example.examportal.entity.Faculty;
import com.example.examportal.exception.DuplicateFacultyCodeException;
import com.example.examportal.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public FacultyResponseDTO createFaculty(FacultyRequestDTO request) {

        if (facultyRepository.existsByFacultyCode(request.getFacultyCode())) {
            throw new DuplicateFacultyCodeException(
                    "Faculty with code " + request.getFacultyCode() + " already exists"
            );
        }

        Faculty faculty = new Faculty(
                request.getFacultyCode(),
                request.getName(),
                request.getEmail()
        );

        Faculty savedFaculty = facultyRepository.save(faculty);

        return new FacultyResponseDTO(
                savedFaculty.getId(),
                savedFaculty.getFacultyCode(),
                savedFaculty.getName(),
                savedFaculty.getEmail()
        );
    }

    public List<FacultyResponseDTO> getAllFaculties(){
        return facultyRepository.findAll().stream().
                map(faculty -> new FacultyResponseDTO(
                        faculty.getId(),
                        faculty.getFacultyCode(),
                        faculty.getName(),
                        faculty.getEmail()
                )).toList();
    }
}
