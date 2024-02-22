/**
   The ParkingMeter class stores data about a parking meter
   for the Parking Ticket Simulator programming challenge.
*/


public class ParkingMeter
{
   private int minutesPurchased; // Minutes purchased

   /*
      Constructor
      minutes The number of minutes purchased.
   */

   public ParkingMeter(int minutes)
   {
      this.minutesPurchased = minutes;
   }

   /*
      setMinutesPurchased method
      minutes The number of minutes purchased.
   */

   public void setMinutesPurchased(int minutes)
   {
      this.minutesPurchased = minutes;
   }

   /*
      getMinutesPurchased method
      return The number of minutes purchased.
   */

   public int getMinutesPurchased()
   {
      return this.minutesPurchased;
   }
}
