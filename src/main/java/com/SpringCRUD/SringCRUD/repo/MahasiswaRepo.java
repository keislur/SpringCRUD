package com.SpringCRUD.SringCRUD.repo;


import com.SpringCRUD.SringCRUD.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long> {
}
