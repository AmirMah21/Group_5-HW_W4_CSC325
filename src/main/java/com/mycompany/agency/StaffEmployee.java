package com.mycompany.agency;


public class StaffEmployee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  Sets up this staff employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
                         String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    //  Complete the implementation of toString to return information
    //  about a staff employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone +
                "\nSocSecNumber: " + socialSecurityNumber + "\nPay Rate: " + payRate;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return payRate;
    }
}