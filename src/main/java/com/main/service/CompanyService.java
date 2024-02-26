package com.main.service;

import com.main.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    List<Company> findAll();
    Company createCompany(Company company);
    Optional<Company> findCompanyById(Long id);
    Company updateCompany(Long id, Company company);
    String deleteCompany(Long id);

}
