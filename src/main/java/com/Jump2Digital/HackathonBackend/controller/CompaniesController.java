package com.Jump2Digital.HackathonBackend.controller;

import com.Jump2Digital.HackathonBackend.model.FoundedCount;
import com.Jump2Digital.HackathonBackend.model.IndustryCount;
import com.Jump2Digital.HackathonBackend.model.SizeCount;
import com.Jump2Digital.HackathonBackend.repository.CompaniesRepository;
import com.Jump2Digital.HackathonBackend.model.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Jump2Digital.HackathonBackend.service.CompaniesService;

import java.util.List;

@RestController
public class CompaniesController {

    @Autowired
    private CompaniesRepository companiesRepository;

    @Autowired
    private CompaniesService companiesService;

    @GetMapping("/")
    public List<Companies> getAllCompanies() {
        return companiesService.getAll();
    }

    @GetMapping("/founded")
    public List<Companies> listAllOrderByFoundedDesc() {
        return companiesService.getAllOrderByFoundedDesc();
    }

    @GetMapping("/size")
    public List<Companies> listAllOrderBySizeAsc() {
        return companiesService.getAllOrderBySizeAsc();
    }

    @GetMapping("/count/industry")
    public List<IndustryCount> listCountByIndustry() {
        return companiesService.getCountByIndustry();
    }

    @GetMapping("/count/size")
    public List<SizeCount> listCountBySize() {
        return companiesService.getCountBySize();
    }

    @GetMapping("/count/founded")
    public List<FoundedCount> listCountByFounded() {
        return companiesService.getCountByFounded();
    }

}
