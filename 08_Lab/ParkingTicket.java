/**
   The ParkingTicket class stores data about a parking ticket
   for the Parking Ticket Simulator programming challenge.
*/


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
      
   }

   /*
      Copy constructor
      ticket2 A ParkingTicket object to copy.
   */

   public ParkingTicket(ParkingTicket ticket2)
   {
     
    }  
         
         
    /*
      calculateFine method
      This method calculates the amount of the parking fine.
   */

   private void calculateFine()
   {
      
   }

   /*
      setCar method
      c A ParkedCar object.
   */

   public void setCar(ParkedCar c)
   {
      
   }

   /*
      setOfficer method
      o A PoliceOfficer object.
   */

   public void setOfficer(PoliceOfficer o)
   {
     
   }

   /*
      getCar method
      return A copy of this object's car field.
   */

   public ParkedCar getCar()
   {
      
   }

   /*
      getFine method
      return The amount of the fine.
   */

   public double getFine()
   {
      
   }

   /*
      getOfficer method
      return A copy of this object's officer field.
   */

   public PoliceOfficer getOfficer()
   {
     
   }

   /*
      toString method
      return A string stating data about the car, the
              police officer, and the parking violation.
   */

   public String toString()
   {
    
   }
}
