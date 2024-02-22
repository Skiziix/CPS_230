/**
   The ParkedCar class stores data about a parked car
   for the Parking Ticket Simulator programming challenge.
*/

public class ParkedCar
{
   private String make;          // The car's make
   private String model;         // The car's model
   private String color;         // The car's color
   private String license;       // The car's licnese number
   private int minutes;          // Minutes parked

   /*
      Constructor
      make The car's make.
      model The car's model.
      color The car's color.
      license The car's license number.
      minutes The number of minutes parked.
   */

   public ParkedCar(String make, String model, String color,
                    String license, int minutes)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.license = license;
      this.minutes = minutes;
   }

   /*
      Copy constructor
      car2 A reference to a ParkedCar object to copy.
   */

   public ParkedCar(ParkedCar car2)
   {
      this.make = car2.make;
      this.model = car2.model;
      this.color = car2.color;
      this.license = car2.license;
      this.minutes = car2.minutes;
   }

   /*
      setMake method
      make The car's make.
   */

   public void setMake(String make)
   {
      this.make = make;
   }

   /*
      setModel method
      model The car's model.
   */

   public void setModel(String model)
   {
     this.model = model;
   }

   /**
      setColor method
      color The car's color.
   */

   public void setColor(String color)
   {
      this.color = color;
   }

   /*
      setLicenseNumber method
      license The car's license number.
   */

   public void setLicenseNumber(String license)
   {
      this.license = license;
   }

   /*
      setMinutesParked method
      minutes The number of minutes parked.
   */

   public void setMinutesParked(int minutes)
   {
      this.minutes = minutes;
   }

   /*
      getMake method
      return The car's make.
   */

   public String getMake()
   {
      return this.make;
   }

   /*
      getModel method
      return The car's model.
   */

   public String getModel()
   {
      return this.model;
   }

   /*
      getColor method
      return The car's color.
   */

   public String getColor()
   {
      return this.color;
   }

   /*
      getLicenseNumber method
      return The car's license number.
   */

   public String getLicenseNumber()
   {
      return this.license;
   }

   /*
      getMinutesParked method
      return The number of minutes parked.
   */

   public int getMinutesParked()
   {
      return this.minutes;      
   }

   /*
      toString method
      return A string stating the car's make, model,
              color, license number, and minutes parked.
   */

   public String toString()
   {

      // Formatted string for printing
      String parkedCar = "Make: " + this.getMake() + 
                         "\nModel: " + this.getModel() +
                         "\nColor: " + this.getColor() +
                         "\nLicense Number: " + this.getLicenseNumber() +
                         "\nMinutes Parked: " + this.getMinutesParked();

      return parkedCar;
   }

   public String forTicket() {

      // Formatted string for a ticket
      String parkedCar = "Make: " + this.getMake() + 
                         "\nModel: " + this.getModel() +
                         "\nColor: " + this.getColor() +
                         "\nLicense Number: " + this.getLicenseNumber();

      return parkedCar;
   }
}
