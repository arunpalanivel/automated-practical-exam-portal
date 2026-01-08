package com.example.examportal.controller;


import com.example.examportal.dto.FacultyRequestDTO;
import com.example.examportal.dto.FacultyResponseDTO;
import com.example.examportal.service.FacultyService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    private final FacultyService facultyService;


    public FacultyController(FacultyService facultyService){
        this.facultyService = facultyService;
    }

    @PostMapping
    public FacultyResponseDTO createFaculty(@Valid @RequestBody FacultyRequestDTO request){
        return facultyService.createFaculty(request);
    }


}
