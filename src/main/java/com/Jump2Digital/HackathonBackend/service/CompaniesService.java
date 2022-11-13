package com.Jump2Digital.HackathonBackend.service;

import com.Jump2Digital.HackathonBackend.model.Companies;
import com.Jump2Digital.HackathonBackend.model.FoundedCount;
import com.Jump2Digital.HackathonBackend.model.IndustryCount;
import com.Jump2Digital.HackathonBackend.model.SizeCount;

import java.util.List;

public interface CompaniesService {
    List<Companies> getAll();

    List<Companies> getAllOrderByFoundedDesc();

    List<Companies> getAllOrderBySizeAsc();

    List<IndustryCount> getCountByIndustry();

    List<SizeCount> getCountBySize();

    List<FoundedCount> getCountByFounded();

}
