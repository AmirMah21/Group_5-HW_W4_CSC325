package com.mycompany.agency;

public class Staff {

    private final StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        staffList[0] = new Executive("Tim", "AAA", "111-111-1111", "111-11-1111", 5.00);
        staffList[1] = new StaffEmployee("Bob", "AAA", "222-222-2222", "222-22-2222", 3.00);
        staffList[2] = new StaffEmployee("Rain", "AAA", "333-333-3333", "333-33-3333", 4.00);
        staffList[3] = new StaffEmployee("Steven", "AAA", "444-444-4444", "444-44-4444", 12.60);
        staffList[4] = new TempEmployee("Jim", "AAA", "555-555-5555", "555-55-5555", 1.25);
        staffList[5] = new Intern("Sue", "AAA", "666-666-6666", "666-66-6666", 0.50);

        staffList[1].pay();
        staffList[2].pay();
        staffList[3].pay();
        staffList[5].pay();

        ((Executive) staffList[0]).awardBonus(500.00);
        ((TempEmployee) staffList[4]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
