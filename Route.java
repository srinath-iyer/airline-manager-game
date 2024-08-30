import java.util.ArrayList;
public class Route{
  // Fields:
private String Destination;
private double Distance;
private double Demand;

// Default Constructor:
public Route(){
  Destination = "N/A";
  Distance = 0;
  Demand = 0;
}

// Constructor
public Route(String Destination, double Distance, double Demand){
  this.Destination = Destination;
  this.Distance = Distance;
  this.Demand = Demand;
}

// Methods:
public String changeDestination(String newDestination){
  Destination = newDestination;
  return Destination;
}

public double changeDistance(double newDistance){
  Distance = newDistance;
  return Distance;
}

public double changeDemand(double newDemand){
  Demand = newDemand;
  return Demand;
}

public String getDestination(){
  return Destination;
}

public double getDemand(){
  return Demand;
}

public double getDistance(){
return Distance;  
}

public double getCost(int Demand, int Distance){
  double Cost;
  Cost = Demand*Distance*100;
  return Cost;
}

public double departRoutes(double Distance, int Total_Capacity, double Demand) throws InterruptedException{
    int a = (int) Distance/600;
    Thread.sleep(500*a);
    double revenue;
    revenue = Distance*Total_Capacity*Demand;
    revenue = (int) revenue; 
  return revenue; 
}

public double gasconsumption(double MPG, double Distance){
double Gas_Consume;
Gas_Consume = MPG*Distance*3;
return Gas_Consume; 
}

public String toString(){
  return Destination + ", " + Distance + " Miles, " + Demand*100 + "% Demand.";
}
}


/* Routes to Get:
Los Angeles:
Route Route_x = new Route("Los Angeles", 2475, 0.7)
London Heathrow:
Route Route_x = new Route("London Heathrow", 3440, 0.65);
Dubai:

Delhi:

Singapore:

Tokyo:

Perth:

Paris:

Toronto:

*/