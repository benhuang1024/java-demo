package com.demo.www;

/**
 *
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After:percent=" + percent);

        System.out.println("\nTesting tripleSalary");
        EmployeeOld harry = new EmployeeOld("Harry", 5000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:salary=" + harry.getSalary());

        System.out.println("\n Testing swap:");
        EmployeeOld a = new EmployeeOld("Alice", 70000);
        EmployeeOld b = new EmployeeOld("Bob", 60000);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());
        swap(a, b);
        System.out.println("After:a=" + a.getName());
        System.out.println("After:b=" + b.getName());

    }


    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method:x = " + x);
    }

    public static void tripleSalary(EmployeeOld x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x.getSalary());
    }

    public static void swap(EmployeeOld x, EmployeeOld y) {
        EmployeeOld temp = x;
        x = y;
        System.out.println("End of method x=" + x.getName());
        System.out.println("End of method y=" + y.getName());

    }
}

class EmployeeOld {
    private String name;
    private double salary;

    public EmployeeOld(String n, double s) {
        name = n;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


