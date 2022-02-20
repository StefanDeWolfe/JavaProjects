package com.gitlab.StefanDeWolfe.Prototype;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PrototypeExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid=Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.print("Enter Employee Name: ");
        String employeeName = br.readLine();

        System.out.print("\n");
        System.out.print("Enter Employee Designation: ");
        String employeeDesignation = br.readLine();

        System.out.print("\n");
        System.out.print("Enter Employee Address: ");
        String employeeAddress = br.readLine();

        System.out.print("\n");
        System.out.print("Enter Employee Salary: ");
        double employeeSalary = Double.parseDouble(br.readLine());

        System.out.print("\n");
        EmployeeRecord employee1 = new EmployeeRecord(eid,employeeName,employeeDesignation,employeeSalary,employeeAddress);

        employee1.showRecord();

        System.out.println("\n");
        EmployeeRecord employeeTwo = (EmployeeRecord) employee1.getClone();
        employeeTwo.showRecord();
    }
}
