package com.app.apprentissage.model;


import jakarta.persistence.Table;



@Table(name = "employee")
public class Employee {

    private Long id;
    private String name;
    private int age;
    private String departement;
    private int performanceScore;


    public Employee(Long id, String name, String departement, int age, int performanceScore) {
        this.id = id;
        this.name = name;
        this.departement = departement;
        this.age = age;
        this.performanceScore = performanceScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", departement='" + departement + '\'' +
                ", performanceScore=" + performanceScore +
                '}';
    }
}
