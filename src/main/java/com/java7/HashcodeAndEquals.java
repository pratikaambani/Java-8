package com.java7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Try this example by adding and removing the hashcode method
public class HashcodeAndEquals {
    public static void main(String[] args) {
        Employee employee = new Employee("22", "0702");

        Map<Employee, String> cache = loadCache();
        String empName = cache.get(employee);
        System.out.println("empName: " +empName);
    }

    static Map<Employee, String> loadCache() {
        Employee emp1 = new Employee("11", "0701");
        Employee emp2 = new Employee("22", "0702");
        Employee emp3 = new Employee("33", "0703");

        Map<Employee, String> cache = new HashMap<>();
        cache.put(emp1, "Pratik");
        cache.put(emp2, "SecondEmp");
        cache.put(emp3, "ThirdEmp");
        return cache;
    }
}

class Employee {
    private String psid;
    private String dob;

    public Employee(String psid, String dob) {
        this.psid = psid;
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(psid, employee.psid) && Objects.equals(dob, employee.dob);
    }

    //if hashcode is not implemented, lookup will fail
    @Override
    public int hashCode() {
        return Objects.hash(psid, dob);
    }
}