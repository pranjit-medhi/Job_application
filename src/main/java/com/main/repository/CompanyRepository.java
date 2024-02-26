package com.main.repository;

import com.main.entity.Company;
import jakarta.persistence.Lob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
