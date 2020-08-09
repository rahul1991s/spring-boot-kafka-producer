package com.rahuls.kafka.springbootkafkaproducer.model;

public class User {

    private String name;
    private String type;
    private Long salary;

    public User(String name, String type, Long salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
