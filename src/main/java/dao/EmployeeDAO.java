package dao;

import domain.Employee;

public class EmployeeDAO {

    Employee employee;
    public void saveEmployee(Employee employee){
        System.out.println("Saved employee into database: " + employee);
    }
    public void deleteEmployee(Employee employee){
        System.out.println("Deleted employee from database");
    }
}
