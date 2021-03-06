package com.sda.marcinkroszel.firstspringmvcapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * RestController
 * Controller is used to generate website, xml or Json model which will be created based on view mechanism.
 * In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller.
 * These components are easily identified by the @RestController annotation.
 */

@RestController
public class EmployeesController {
    @RequestMapping("getEmployees")
    public List<Employee> getEmployees() {
        List<Employee> result = new ArrayList<>();

        result.add(new Employee("Jan", "Kowalski", new BigDecimal("3000.99")));
        result.add(new Employee("Zbigniew", "Nowakowski", new BigDecimal("3500.50")));
        result.add(new Employee("Agnieszka", "Drozdowska", new BigDecimal("4000.10")));

        return result;
    }
}