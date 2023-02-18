package com.mycompany.agency;



// TODO 1: Make TempEmployee a child of StaffEmploee - Done
public class TempEmployee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's
    //  accumulated hours. - Done.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee. - Done
    //-----------------------------------------------------------------
    public double pay()
    {
        double pay = hoursWorked * payRate;
        hoursWorked = 0;
        
        return pay;
    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string. - Done
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString();
    }
}
