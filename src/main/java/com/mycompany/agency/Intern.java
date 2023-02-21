package com.mycompany.agency;


public class Intern extends StaffEmployee {
    //-----------------------------------------------------------------
    //  Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return 0.00;
    }
}
