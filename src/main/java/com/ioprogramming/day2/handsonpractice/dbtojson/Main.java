package com.ioprogramming.day2.handsonpractice.dbtojson;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBConnection databaseFetcher = new DBConnection();
        List<Employee> employees = databaseFetcher.fetchEmployees();

        if (employees.isEmpty()) {
            System.out.println("No records found in the database.");
            return;
        }

        ReportGenerator jsonReportGenerator = new ReportGenerator();
        String filePath = "D:\\File\\day2\\employee_report.json"; // Change path as needed
        jsonReportGenerator.generateJsonReport(employees, filePath);
    }
}