package com.codedifferently.petshop.staff;

import com.codedifferently.petshop.staff.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void constructorTest01(){
        Employee obj = new Employee("Yennifer");
        String expected = "Yennifer 1";
        String actual = obj.toString();
        Assertions.assertEquals(expected,actual);

    }
}
