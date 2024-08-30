import java.util.ArrayList;
public class Plane{
  // Fields
 private String Model; // Ex. 737-800
 private int Price; // In US Dollars
 private int Range; // In Miles
 private int Capacity; // Capacity will be in a 60% economy class, 35% business class, and 15% first class. Business class = 2 economy seats and First class = 3 economy seats.
 private int Gas_per_Mile; // Gallons per mile
 private int Speed; // MPH
 private int maintain_hours;
 private boolean Route;

  // Default Plane
 public Plane(){
   Model = "N/A";
   Price = 0;
   Range = 0;
   Capacity = 0;
   Gas_per_Mile = 0;
   Speed = 0;
   maintain_hours = 0;
   Route = false;
 }
  // Constructor
 public Plane(String Model, int Price, int Range, int Capacity, int MPG, int Speed, int maintain_hours, boolean Route){
   this.Model = Model;
   this.Price = Price;
   this.Range = Range;
   this.Capacity = Capacity;
   MPG = Gas_per_Mile;
   this.Speed = Speed;
   this.maintain_hours = maintain_hours;
   this.Route = Route;

 }
  // Methods
  
  public boolean changeRouteStatus(){
    Route = true;
    return Route;
  }

  public boolean getRoute(){
    return Route;
  }

 public String changeModel(String newModel){
   Model = newModel;
   return Model;
 }

 public int changePrice(int newPrice){
   Price = newPrice;
   return Price;
 }

 public int changeRange(int newRange){
   Range = newRange;
   return Range;

 }

 public int changeCapacity(int newCapacity){
   Capacity = newCapacity;
   return Capacity;
 }

 public int changeMPG(int newMPG){
   Gas_per_Mile = newMPG;
   return Gas_per_Mile;
 }

 public int changeSpeed(int newSpeed){
   Speed = newSpeed;
   return Speed;
 }

 public int getMaintainHours1(){
   return maintain_hours;
 }

 public int getMaintainHours(int Speed, int Distance){
   maintain_hours-=(Distance/Speed);
   return maintain_hours;
 }

 public void resetMaintainHours(){
   maintain_hours = 150;
 }

 public double getMaintanence(double maintain_hours){
   double total_cost = 0;
   if (maintain_hours <= 10){
     total_cost = 300000;
   }
   if (maintain_hours < 0){
     total_cost = 3000000;
   }
     if (maintain_hours > 10){
      total_cost = 75000;
     } 
     return total_cost;   
 }

 public int getCapacity(){
   return Capacity;
 }

 public int getPrice(){
   return Price;
 }

 public int getRange(){
   return Range;
 }

 public int getMPG(){
   return Gas_per_Mile;
 }

 public String getModel(){
   return Model;
 }

 public int getSpeed(){
   return Speed;
 }

 public String toString(){
   return Model + ", $" + Price + ", " + Range + " miles, " + Capacity + " seats, " + Gas_per_Mile + " miles per gallon, " + Speed + " mph, " + maintain_hours + " hours, " + Route +".";
 }


}

/*
Planes to get:
737-800: 
Plane Plane_x = new Plane("737-800", 1000000, 3582, 150, 1, 588, 150);
787-8: 
Plane Plane_x = new Plane("787-8", 8000000, 7305, 230, 1, 593, 150);
757-200:
Plane Plane_x = new Plane("757-200", 3500000, 4488, 200, 1, 528, 150);
747-400:
Plane Plane_x = new Plane("747-400", 35000000, 8357, 575, 2, 614, 150 );
A320-200:
Plane Plane_x = new Plane("A310-100", 2000000, 5750, 107, 1, 511, 150);
A340-200:
Plane Plane_x = new Plane("A240-200", 7000000, 8000, 240, 3, 548, 150);
A350-1000:
Plane Plane_x = new Plane("A350-1000", 30000000, 8700, 360, 1, 560, 150);
A380-800:
Plane Plane_x = new Plane("A380-800", 50000000, 9569, 615, 2, 683, 150);

*/