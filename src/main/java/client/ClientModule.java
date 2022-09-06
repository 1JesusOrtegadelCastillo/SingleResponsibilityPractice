package client;

import dao.EmployeeDAO;
import domain.Employee;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

    public static void main(String[] args){

        Employee roxy = new Employee(1, "Roxy", "Odontology", true);
        ClientModule.hireNewEmployee(roxy);
        printEmployeeReport(roxy, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

}
