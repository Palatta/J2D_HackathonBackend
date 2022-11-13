package com.Jump2Digital.HackathonBackend.service;

import com.Jump2Digital.HackathonBackend.model.FoundedCount;
import com.Jump2Digital.HackathonBackend.model.IndustryCount;
import com.Jump2Digital.HackathonBackend.model.SizeCount;
import com.Jump2Digital.HackathonBackend.repository.CompaniesRepository;
import com.Jump2Digital.HackathonBackend.model.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesServiceImpl implements CompaniesService{
    @Autowired
    private CompaniesRepository companiesRepository;

    @Override
    public List<Companies> getAll() {

        return companiesRepository.findAll();
    }

    @Override
    public List<Companies> getAllOrderByFoundedDesc() {
        return companiesRepository.findAllOrderByFoundedDesc();
    }

    @Override
    public List<Companies> getAllOrderBySizeAsc() {
        return companiesRepository.findAllOrderBySizeAsc();
    }

    @Override
    public List<IndustryCount> getCountByIndustry() {
        return companiesRepository.countNumberOfCompaniesGroupedByIndustry();
    }

    @Override
    public List<SizeCount> getCountBySize() {
        return companiesRepository.countNumberOfCompaniesGroupedBySize();
    }

    @Override
    public List<FoundedCount> getCountByFounded() {
        return companiesRepository.countNumberOfCompaniesGroupedByFounded();
    }

}
