/*
   The PoliceOfficer class stores data about a police officer
   for the Parking Ticket Simulator programming challenge.
*/


public class PoliceOfficer
{
   private String name;          // Officer's name
   private String badgeNumber;   // Badge number

   /*
      Constructor
      name The officer's name.
      badgeNumber The officer's badge number.
   */

   public PoliceOfficer(String name, String badgeNumber)
   {
     this.name = name;
     this.badgeNumber = badgeNumber;
   }

   /*
      Copy constructor
      officer2 The PoliceOfficer object to copy.
   */

   public PoliceOfficer(PoliceOfficer officer2)
   {
      this.name = officer2.name;
      this.badgeNumber = officer2.badgeNumber;
   }
   /*
      setName method
      name The officer's name.
   */

   public void setName(String name)
   {
      this.name = name;
   }

   /*
      setBadgeNumber method
      badgeNumber The officer's badge number.
   */

   public void setBadgeNumber(String badgeNubmer)
   {
      this.badgeNumber = badgeNubmer;
   }

   /*
      getName method
      return The officer's name.
   */

   public String getName()
   {
      return this.name;
   }

   /*
      getBadgeNumber method
      return The officer's badge number
   */

   public String getBadgeNumber()
   {
      return this.badgeNumber;
   }

   /*
      The patrol method looks at the number of
      minutes a car has been parked and the number
      of minutes purchased. If the minutes parked
      is greater than the minutes purchased, a
      ParkingTicket object is returned. Otherwise
      the method returns null.
      car A ParkedCar object.
      meter A ParkingMeter object.
      return A ParkingTicket object if a violation
              occurred, null otherwise.
   */

   public ParkingTicket patrol(ParkedCar car,
                               ParkingMeter meter)
   {

      // The illegally parked time
      int difference = car.getMinutesParked() - meter.getMinutesPurchased();

      // Creating ticket
      ParkingTicket ticket = new ParkingTicket(car, this, difference);

      return ticket;
   }

   /*
      toString method
      return A string stating the officer's name
              and badge number.
   */

   public String toString()
   {

      // Formatting string for printing
      String officer = "\nName: " + this.getName() +
                       "\nBadge Number: " + this.getBadgeNumber() +
                       "\n";

      return officer;
   }

}
