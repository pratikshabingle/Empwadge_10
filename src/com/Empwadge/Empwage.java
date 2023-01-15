package com.Empwadge;

public class Empwage {


    private String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;


    public Empwage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalEmpWage = totalEmpWage;
    }


    @Override
    public String toString () {
        return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
    }

    public static <EmployeeWage> void main (String[] args) {
        Empwage kd = new Empwage ("KD", 20, 2, 10);
        Empwage ced = new Empwage ("CED", 20, 2, 10);
        kd.toString ();
        System .out .println (kd);
        ced.toString ();
        System .out .println (ced) ;
    }
}