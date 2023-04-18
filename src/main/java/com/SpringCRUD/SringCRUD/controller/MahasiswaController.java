package com.SpringCRUD.SringCRUD.controller;

import com.SpringCRUD.SringCRUD.model.Mahasiswa;
import com.SpringCRUD.SringCRUD.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MahasiswaController {

    // Annotation
    @Autowired
    private MahasiswaService mahasiswaService;

    // Save operation
    @PostMapping("/mahasiswa/create")
    public Mahasiswa saveMahasiswa(@Validated @RequestBody Mahasiswa mahasiswa)
    {
        return mahasiswaService.saveMahasiswa(mahasiswa);
    }

    // Read operation
    @GetMapping("/mahasiswa")
    public List <Mahasiswa> mahasiswaList()
    {
        return mahasiswaService.mahasiswaList();
    }

    // Update operation
    @PutMapping("/mahasiswa/{id}")
    public Mahasiswa updateMahasiswa(@RequestBody Mahasiswa mahasiswa, @PathVariable("id") Long id)
    {
        return mahasiswaService.updateMahasiswa(mahasiswa, id);
    }

    // Delete operation
    @DeleteMapping("/mahasiswa/{id}")
    public String deleteMahasiswaById(@PathVariable("id") Long id)
    {
        mahasiswaService.deleteMahasiswaById(id);
        return "Deleted Successfully";
    }
}
