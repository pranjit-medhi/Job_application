package com.main.controller;

import com.main.entity.Company;
import com.main.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping
    public ResponseEntity<List<Company>> getAllCompany()
    {
        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Company> addCompany(@RequestBody Company company)
    {
        return  new ResponseEntity<>(companyService.createCompany(company), HttpStatus.CREATED);
    }
}
