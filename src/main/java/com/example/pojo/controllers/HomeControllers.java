package com.example.pojo.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pojo.test.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeControllers {
    @RequestMapping(value = "employees" , method = RequestMethod.GET)
    public List <Employee> getEmployees(Model model){
        List <Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("David R", "1996", 42000));
        employeeList.add(new Employee("Bill", "0021", 65000));

        return employeeList;

    }


}
