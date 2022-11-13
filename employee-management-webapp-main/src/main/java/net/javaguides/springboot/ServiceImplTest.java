package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;

public class ServiceImplTest
{
    EmployeeService empServ;

    Employee emp = new Employee("omar","naffeti","omar.nafeti@springboot.com");
    Employee e = empServ.saveEmployee(emp);
    System.out.print("Employee :" + e);
    assertNotNull(e.getId());
    assertNotNull(e.getLastName());
    assertTrue(e.getEmail().length() > 0);
    EmployeeService.deleteEmployeeById(e.getId());
}
