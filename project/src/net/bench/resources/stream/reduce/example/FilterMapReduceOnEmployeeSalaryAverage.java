package net.bench.resources.stream.reduce.example;

import java.util.Arrays;
import java.util.List;

import com.orchard.program.Employee;
 
public class FilterMapReduceOnEmployeeSalaryAverage {
 
    public static void main(String[] args) {
 
        // 1. list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Krish", "IT", 7000),
                new Employee(102, "Viraj", "IT", 6000),
                new Employee(103, "Suresh", "IT", 31000),
                new Employee(104, "Aditya", "IT", 11000),
                new Employee(105, "Rishi", "IT", 28000),
                new Employee(105, "Rashi", "It", 34000),
                new Employee(105, "Raghav", "IT", 26000),
                new Employee(105, "Ramya", "IT", 29000),
                new Employee(105, "Akhil", "IT", 35000),
                new Employee(105, "Sekhar", "IT", 44000)
                
                );
        // 1.2 print original Student list
        System.out.println("Employees list :- \n");
        employees.stream().forEach(System.out::println);
        
     // 2. get TOTAL salary of IT employees
        long totalSalaryOfItEmp = employees
                .stream()
                .filter(employee -> employee.getDepartment()
                        .equalsIgnoreCase("IT")) // filter
                .mapToLong(employee -> employee.getSalary()) // map
                .sum(); // reduce
        
        // 2.1 print to console
        System.out.println("\nThe Total salary of employees"
                + " working in IT department is = "
                + totalSalaryOfItEmp);
 
 
        // 3. get COUNT of IT employees
        long countOfItEmp = employees
                .stream()
                .filter(employee -> employee.getDepartment()
                        .equalsIgnoreCase("IT")) // filter
                .count(); // reduce
 
        // 3.1 print to console
        System.out.println("\nCount of employees"
                + " working in IT department is = "
                + countOfItEmp);
 
 
        // 4. get AVERAGE salary of IT employees
        double average = employees
                .stream()
                .filter(employee -> employee.getDepartment()
                        .equalsIgnoreCase("IT")) // filter
                .mapToLong(employee -> employee.getSalary()) // map
                .average() // reduce
                .getAsDouble(); // return double
 
        // 4.1 print to console
        System.out.println("\nThe average salary of employees"
                + " working in IT department is = "
                + average);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        