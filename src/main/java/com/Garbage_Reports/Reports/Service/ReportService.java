package com.Garbage_Reports.Reports.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Garbage_Reports.Reports.Entity.Report;
import com.Garbage_Reports.Reports.Repository.ReportRepository;

@Service
public class ReportService {

    @Autowired
    private ReportRepository repo;

    public Report saveReport(Report report) {
        return repo.save(report);
    }

    public List<Report> getAllReports() {
        return repo.findAll();
    }

    public Report findById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteById(int id) {
        repo.deleteById(id);
    }

}
