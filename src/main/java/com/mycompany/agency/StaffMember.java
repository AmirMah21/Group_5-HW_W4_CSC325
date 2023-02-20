package com.mycompany.agency;


public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public abstract double pay();
}
