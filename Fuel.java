public class Fuel{
// Field
private int quality;

// Default Constructor
public Fuel(){
  quality = 0;
}

// Constructor 
public Fuel(int Quality){
  Quality = quality;
}

// Methods
public static double getFuelPrice(){
  double Price;
  Price = Math.random()+0.5;
  return Price;
}

public static double getFuelAmount(double FuelAmount, double FuelChange){
FuelAmount+=FuelChange;
return FuelAmount;
}

public static double buyFuel(double Amount, double Cost, double money){
  double total_cost;
  total_cost = Amount*Cost;
  return total_cost*-1;

}
}