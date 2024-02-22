/**
   The ParkingTicket class stores data about a parking ticket
   for the Parking Ticket Simulator programming challenge.
*/

import java.lang.Math;

public class ParkingTicket
{
   private ParkedCar car;           // The parked car
   private PoliceOfficer officer;   // The police officer
   private double fine;             // The parking fine
   private int minutes;             // Minutes illegally parked

   // Constant for the base fine.
   public final double BASE_FINE = 25.0;

   // Contant for the additional hourly fine.
   public final double HOURLY_FINE = 10.0;

   /*
      Constructor
      aCar A ParkedCar object.
      anOfficer A PoliceOfficer object.
      min Minutes illegally parked.
   */

   public ParkingTicket(ParkedCar aCar,
                        PoliceOfficer anOfficer,
                        int min)
   {
      this.car = aCar;
      this.officer = anOfficer;
      this.minutes = min;

      this.calculateFine();
   }

   /*
      Copy constructor
      ticket2 A ParkingTicket object to copy.
   */

   public ParkingTicket(ParkingTicket ticket2)
   {
      this.car = ticket2.car;
      this.officer = ticket2.officer;
      this.fine = ticket2.fine;
      this.minutes = ticket2.minutes;
   }  
         
         
    /*
      calculateFine method
      This method calculates the amount of the parking fine.
   */

   private void calculateFine()
   {
      // Division rounding up to the nearest hour and minus one for the hourly fine
      int hoursBilled = Math.ceilDiv(this.minutes, 60) - 1;

      // The fine is equal to the base rate times hours above the first
      this.fine = this.BASE_FINE + (this.HOURLY_FINE * hoursBilled);

   }

   /*
      setCar method
      aCar A ParkedCar object.
   */

   public void setCar(ParkedCar aCar)
   {
      this.car = aCar;
   }

   /*
      setOfficer method
      anOfficer A PoliceOfficer object.
   */

   public void setOfficer(PoliceOfficer anOfficer)
   {
      this.officer = anOfficer;
   }

   /*
      getCar method
      return A copy of this object's car field.
   */

   public ParkedCar getCar()
   {
      return this.car;
   }

   /*
      getFine method
      return The amount of the fine.
   */

   public double getFine()
   {
      return this.fine;
   }

   /*
      getOfficer method
      return A copy of this object's officer field.
   */

   public PoliceOfficer getOfficer()
   {
      return this.officer;
   }

   /*
      toString method
      return A string stating data about the car, the
              police officer, and the parking violation.
   */

   public String toString()
   {

      // Formatted string for printing
      String ticket = this.car.forTicket() +
                      "\nFine Amount: " + this.getFine() +
                      "\nPolice Officer's Badge No.: " + this.officer.getBadgeNumber();

      return ticket;
   }
}
