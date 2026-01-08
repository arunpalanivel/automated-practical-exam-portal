package com.example.examportal.service;


import com.example.examportal.dto.FacultyRequestDTO;
import com.example.examportal.dto.FacultyResponseDTO;
import com.example.examportal.dto.StudentResponseDTO;
import com.example.examportal.entity.Faculty;
import com.example.examportal.repository.FacultyRepository;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public FacultyResponseDTO createFaculty(FacultyRequestDTO request) {

        if (facultyRepository.existsByFacultyCode(request.getFacultyCode())) {
            throw new RuntimeException(
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
}
