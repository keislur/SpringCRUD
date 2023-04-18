package com.SpringCRUD.SringCRUD.service;

import com.SpringCRUD.SringCRUD.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {
    // Save operation
    Mahasiswa saveMahasiswa(Mahasiswa mahasiswa);

    // Read operation
    List<Mahasiswa> mahasiswaList();

    // Update operation
    Mahasiswa updateMahasiswa(Mahasiswa mahasiswa,Long id);

    // Delete operation
    void deleteMahasiswaById(Long id);
}
