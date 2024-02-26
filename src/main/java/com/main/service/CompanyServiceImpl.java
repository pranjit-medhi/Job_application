package com.main.service;

import com.main.entity.Company;
import com.main.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company createCompany(Company company) {
        Company savedCompany = companyRepository.save(company);
        return savedCompany;
    }

    @Override
    public Optional<Company> findCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company updateCompany(Long id, Company company) {
        Company companyUpdated = companyRepository.findById(id).get();
       return companyUpdated;
    }

    @Override
    public String deleteCompany(Long id) {
         companyRepository.deleteById(id);
        return "deleted successfully";
    }
}
