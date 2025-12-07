package com.judsonpaiva.demo;

import com.judsonpaiva.entities.Employee;
import com.judsonpaiva.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.judsonpaiva"})
public class DemoApplication implements CommandLineRunner
{
    private SalaryService salaryService;

    public DemoApplication(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee(4000.0,"Maria");
        System.out.println(salaryService.netSalary(employee));
    }
}
