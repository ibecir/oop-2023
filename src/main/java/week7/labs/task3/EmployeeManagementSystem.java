package week7.labs.task3;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .collect(Collectors.toList());
    }
    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(employee -> employee.salary())
                .sum();
    }
    public void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee.toString()));
    }
}
