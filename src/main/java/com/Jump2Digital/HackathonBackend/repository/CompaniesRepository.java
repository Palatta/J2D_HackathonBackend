package com.Jump2Digital.HackathonBackend.repository;

import com.Jump2Digital.HackathonBackend.model.Companies;
import com.Jump2Digital.HackathonBackend.model.FoundedCount;
import com.Jump2Digital.HackathonBackend.model.IndustryCount;
import com.Jump2Digital.HackathonBackend.model.SizeCount;
import org.hibernate.engine.jdbc.Size;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompaniesRepository extends JpaRepository<Companies, String> {
    @Query(value="SELECT c FROM Companies c ORDER BY c.founded DESC")
    List<Companies> findAllOrderByFoundedDesc();

    @Query(value="select * from companies order by CAST(size AS UNSIGNED);", nativeQuery = true)
    List<Companies> findAllOrderBySizeAsc();

    @Query(value = "select industry, COUNT(industry) AS numberOfCompanies from companies as c group by industry", nativeQuery = true)
    List<IndustryCount> countNumberOfCompaniesGroupedByIndustry();

    @Query(value = "select size, COUNT(size) AS numberOfCompanies from companies as c group by size", nativeQuery = true)
    List<SizeCount> countNumberOfCompaniesGroupedBySize();

    @Query(value = "select founded, COUNT(founded) AS numberOfCompanies from companies as c group by founded", nativeQuery = true)
    List<FoundedCount> countNumberOfCompaniesGroupedByFounded();

}
