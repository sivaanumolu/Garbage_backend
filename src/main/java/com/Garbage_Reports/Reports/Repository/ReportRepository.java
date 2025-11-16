package com.Garbage_Reports.Reports.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Garbage_Reports.Reports.Entity.Report;

public interface ReportRepository extends JpaRepository<Report, Integer> {

}
