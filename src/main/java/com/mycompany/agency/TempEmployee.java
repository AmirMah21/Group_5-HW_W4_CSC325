package com.mycompany.agency;


public class TempEmployee extends StaffEmployee {
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
                        String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    //  Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        double pay = hoursWorked * payRate;
        hoursWorked = 0;

        return pay;
    }

    //-----------------------------------------------------------------
    //  Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        return super.toString();
    }
}
