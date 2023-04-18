package com.SpringCRUD.SringCRUD.service;

import com.SpringCRUD.SringCRUD.model.Mahasiswa;
import com.SpringCRUD.SringCRUD.repo.MahasiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MahasiswaImp implements MahasiswaService{

    @Autowired
    private MahasiswaRepo mahasiswaRepo;

    @Override
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa)
    {
        return mahasiswaRepo.save(mahasiswa);
    }

    // Read Operation
    @Override
    public List <Mahasiswa> mahasiswaList(){
        return(List <Mahasiswa>) mahasiswaRepo.findAll();
    }

    // Update operation
    @Override
    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa, Long id)
    {
        Mahasiswa mahDB = mahasiswaRepo.findById(id).get();

        if (Objects.nonNull(mahasiswa.getNama()) && !"".equalsIgnoreCase(mahasiswa.getNama())) {
            mahDB.setNama(mahasiswa.getNama());
        }

        if (Objects.nonNull(mahasiswa.getJurusan()) && !"".equalsIgnoreCase(mahasiswa.getJurusan())) {
            mahDB.setJurusan(mahasiswa.getJurusan());
        }

        if (Objects.nonNull(mahasiswa.getNim()) && !"".equalsIgnoreCase(mahasiswa.getNim())) {
            mahDB.setNim(mahasiswa.getNim());
        }

        return mahasiswaRepo.save(mahDB);
    }

    // Delete operation
    @Override
    public void deleteMahasiswaById(Long id)
    {
        mahasiswaRepo.deleteById(id);
    }

}
