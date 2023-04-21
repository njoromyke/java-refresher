package com.mykesoftware;

public class Employee {

    private  int baseSalary;
    private   int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public  int calculateWage(int extraHours){
        return  baseSalary + (hourlyRate * extraHours);
    }

    private   void  setBaseSalary(int baseSalary){
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
            this.baseSalary = baseSalary;
    }

    private   int getBaseSalary(){
        return baseSalary;
    }

    private   void  setHourlyRate(int hourlyRate){
        if(hourlyRate <=0)
            throw new IllegalArgumentException("Hourly rate cannot be less than zero");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

}
