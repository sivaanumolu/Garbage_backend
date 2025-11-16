package com.Garbage_Reports.Reports.Controllers;

import java.util.List;
import java.util.Map;   // ✅ you missed this import

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Garbage_Reports.Reports.Entity.Report;
import com.Garbage_Reports.Reports.Service.ReportService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService service;

    @PostMapping
    public String submitReport(@RequestBody Report report) {
        service.saveReport(report);
        return "Report submitted successfully!";
    }

    @GetMapping
    public List<Report> getReports() {
        return service.getAllReports();
    }

    @PutMapping("/{id}/status")
    public String updateStatus(@PathVariable int id, @RequestBody Map<String, String> body) {
        Report report = service.findById(id);
        report.setStatus(body.get("status"));
        service.saveReport(report);
        return "Status updated!";
    }

    @DeleteMapping("/{id}")
    public String deleteReport(@PathVariable int id) {
        service.deleteById(id);
        return "Deleted successfully!";
    }
}
