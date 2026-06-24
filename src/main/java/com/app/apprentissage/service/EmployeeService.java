package com.app.apprentissage.service;


import com.app.apprentissage.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();


    // cretaion Ajout


    public void addEmployee(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException("Employee ne peut pas être null");
        }

        if (employee.getName() == null || employee.getName().isBlank()) {
            throw new IllegalArgumentException("Nom obligatoire");
        }

        employeeList.add(employee);
    }

    // update
    public Employee updateEmployee(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException("Employee ne peut pas être null");
        }

        for (Employee e : employeeList) {

            if (Objects.equals(e.getId(), employee.getId())) {

                e.setName(employee.getName());
                e.setAge(employee.getAge());
                e.setDepartement(employee.getDepartement());

                return e;
            }
        }

        throw new IllegalArgumentException(
                "Employee introuvable avec id: " + employee.getId()
        );
    }


    // suppresion

    public void supprimerEmployee(Employee employee) {

        employeeList.removeIf(e ->
                Objects.equals(e.getId(), employee.getId())
        );
    }

    // sortir les 3 plus productive employe qui ont min 35 ans par departement

    public void top3PerDepartmentAgeAbove35(String dept, List<Employee> list) {

        for (Employee e : employeeList){


        }
    }
}