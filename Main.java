// Created by Srinath Iyer; Started on 22/Jul/2020.
/* Some Important Facts- For Your Reference:
List of Planes Available to buy:
- 737-800
- 787-8
- 757-200
- 747-400
- A320-100
- A340-200
- A350-1000
- A380-800
- More coming Soon?????
List of Airports available (All from New York JFK):
- Los Angeles
- London Heathrow
- Dubai
- Delhi
- Singapore
- Tokyo
- Buenos Aires
- Paris
- Toronto
- New York JFK
- More Coming Soon???
*/
import java.util.*;
class Main {
  public static void main(String[] args) throws InterruptedException{

  // Set Up
  System.out.println("Airline Manager:");
  System.out.println("✈");
  System.out.println();
  Thread.sleep(2000);
  System.out.println("Become the CEO of an airline only with $1,000,000 and a small plane and transform it into the next billion dollar company. Do you have what it takes to make it?");
  Thread.sleep(2000);
  Scanner Input = new Scanner(System.in);
  System.out.println("What is the name of your airline?");
  String name = Input.nextLine();
  System.out.println("Input CEO Name.");
  String CEO = Input.nextLine()
;
  System.out.println("Welcome "+ CEO + ", CEO of " + name + ". We hope that you will grow your company and flourish.");
  System.out.println();
  System.out.println("Press Enter to continue");
  String start = Input.nextLine(); // This is a great way to make the program wait for user readability.
  double cash = 1000000; // Initializing Money Variable

  // Creating Empty planes and Empty Routes and storing them in ArrayLists!
    ArrayList<Plane> EmptyPlanes = new ArrayList<Plane>(); // Plane Templates
    ArrayList<Route> EmptyRoutes = new ArrayList<Route>(); // Route Templates
    ArrayList<Plane> Fleet = new ArrayList<Plane>(); // Fleet
    ArrayList<Route> Routes = new ArrayList<Route>(); // Existing Routes
      // Planes
      Plane Plane_1 = new Plane();
      EmptyPlanes.add (Plane_1);
      Plane Plane_2 = new Plane();
      EmptyPlanes.add (Plane_2);
      Plane Plane_3 = new Plane();
      EmptyPlanes.add (Plane_3);
      Plane Plane_4 = new Plane();
      EmptyPlanes.add (Plane_4);
      Plane Plane_5 = new Plane();
      EmptyPlanes.add (Plane_5);
      Plane Plane_6 = new Plane();
      EmptyPlanes.add (Plane_6);
      Plane Plane_7 = new Plane();
      EmptyPlanes.add (Plane_7);
      Plane Plane_8 = new Plane();
      EmptyPlanes.add (Plane_8);
      Plane Plane_9 = new Plane();
      EmptyPlanes.add (Plane_9);
      Plane Plane_10 = new Plane();
      EmptyPlanes.add (Plane_10);
      Plane Plane_11 = new Plane();
      EmptyPlanes.add (Plane_11);
      Plane Plane_12 = new Plane();
      EmptyPlanes.add (Plane_12);
      Plane Plane_13= new Plane();
      EmptyPlanes.add (Plane_13);
      Plane Plane_14= new Plane();
      EmptyPlanes.add (Plane_14);
      Plane Plane_15= new Plane();
      EmptyPlanes.add (Plane_15);
      Plane Plane_16= new Plane();
      EmptyPlanes.add (Plane_16);
      Plane Plane_17= new Plane();
      EmptyPlanes.add (Plane_17);
      Plane Plane_18= new Plane();
      EmptyPlanes.add (Plane_18);
      Plane Plane_19= new Plane();
      EmptyPlanes.add (Plane_19);
      Plane Plane_20= new Plane();
      EmptyPlanes.add (Plane_20);

      // Routes
    Route Route_1 = new Route();
    EmptyRoutes.add (Route_1);
    Route Route_2 = new Route();
    EmptyRoutes.add (Route_2);
    Route Route_3 = new Route();
    EmptyRoutes.add (Route_3);
    Route Route_4 = new Route();
    EmptyRoutes.add (Route_4);
    Route Route_5 = new Route();
    EmptyRoutes.add (Route_5);
    Route Route_6 = new Route();
    EmptyRoutes.add (Route_6);
    Route Route_7 = new Route();
    EmptyRoutes.add (Route_7);
    Route Route_8 = new Route();
    EmptyRoutes.add (Route_8);
    Route Route_9 = new Route();
    EmptyRoutes.add (Route_9);
    Route Route_10 = new Route();
    EmptyRoutes.add (Route_10);
    Route Route_11 = new Route();
    EmptyRoutes.add (Route_11);
    Route Route_12 = new Route();
    EmptyRoutes.add (Route_12);
    Route Route_13 = new Route();
    EmptyRoutes.add (Route_13);
    Route Route_14 = new Route();
    EmptyRoutes.add (Route_14);
    Route Route_15 = new Route();
    EmptyRoutes.add (Route_15);
    Route Route_16 = new Route();
    EmptyRoutes.add (Route_16);
    Route Route_17 = new Route();
    EmptyRoutes.add (Route_17);
    Route Route_18 = new Route();
    EmptyRoutes.add (Route_18);
    Route Route_19 = new Route();
    EmptyRoutes.add (Route_19);
    Route Route_20 = new Route();
    EmptyRoutes.add (Route_20);

  // Guide for the game
  System.out.println("Here is some tips and rules for the game:");
  System.out.println();
  System.out.println("You will start out with a Boeing 737-800. You can assign it on a route to any of the 9 other airports in the simualator. You need to expand your fleet with the money you make. In addition, you'll need to buy fuel, which is randomly changing in price.");
  System.out.print("Your default Hub is New York JFK. After every 150 hours on a plane, you'll need to pay a certain amount to maintain it.");
  System.out.println();
  System.out.println("This game is menu based, which means that it will need user input after every move. Good Luck. Press Enter.");
  String start_now = Input.nextLine();
  System.out.println("First, let's create a route. We're going to create a route from New York to Los Angeles.");
  EmptyPlanes.get(0).changeModel("737-800");
  EmptyPlanes.get(0).changePrice(1000000);
  EmptyPlanes.get(0).changeRange(3582);
  EmptyPlanes.get(0).changeCapacity(150);
  EmptyPlanes.get(0).changeSpeed(558);
  EmptyPlanes.get(0).changeMPG(1);
  EmptyPlanes.get(0).resetMaintainHours();
  Fleet.add(EmptyPlanes.get(0));
  EmptyPlanes.remove(0);
  EmptyRoutes.get(0).changeDestination("Los Angeles");
  Fleet.get(Fleet.size()-1).changeRouteStatus();
  EmptyRoutes.get(0).changeDistance(2475);
  EmptyRoutes.get(0).changeDemand(0.7);
  Routes.add (EmptyRoutes.get(0));
  EmptyRoutes.remove(0);
  System.out.println("Let's depart this flight. Press Enter.");
  String depart_1 = Input.nextLine();
  System.out.println("Departing planes.... Waiting for planes to reach destination.");
  double r = Route_1.departRoutes(Route_1.getDistance(), Plane_1.getCapacity(), Route_1.getDemand());
  cash+=r;
  System.out.println("Well Done! You have departed your first flight and now you've earned : " + r + " dollars!");
  Thread.sleep(1000);
  System.out.println();
  System.out.println("Now, let's buy a new plane. In the game, you can chose any plane you can afford, but because this is a starting guide, and you can only afford one plane, we will buy you a 737-800 automatically.");
      Thread.sleep(1000);
      System.out.println();
      System.out.println("We will fly this plane to London Heathrow. In the game, you will be able to chose the routes to fly on as long as your plane will be able to fly that route.");
      EmptyPlanes.get(0).changeModel("737-800");
      EmptyPlanes.get(0).changePrice(1000000);
      EmptyPlanes.get(0).changeRange(3582);
      EmptyPlanes.get(0).changeCapacity(150);
      EmptyPlanes.get(0).changeSpeed(558);
      EmptyPlanes.get(0).changeMPG(1);
      EmptyPlanes.get(0).resetMaintainHours();
      
      Fleet.add(EmptyPlanes.get(0));
      EmptyPlanes.remove(0);
      cash-=1000000;
      Thread.sleep(1000);
      System.out.println();
      System.out.println("Now Let's depart this flight.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("London Heathrow");
      EmptyRoutes.get(0).changeDistance(3440);
      EmptyRoutes.get(0).changeDemand(0.65);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Press enter to Depart Flights.");
      depart_1 = Input.nextLine();
      System.out.println("Departing Routes.... Waiting for planes to reach destination.");
      r = Route_2.departRoutes(Route_2.getDistance(), Plane_2.getCapacity(), Route_2.getDemand());
      cash+=r;
      System.out.println();
      System.out.println("You have departed another flight and now you've earned : " + r + " dollars!");
      Thread.sleep(2000);
      System.out.println();
      System.out.println("That's pretty much all there is, now it's your turn to play the game!");
      Thread.sleep(3000);
  System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
  System.out.println("Well done. You've learned the basic tips of the game and are ready to proceed to grow the company on your own. After this point, you can create your own routes and buy planes of your choice. As a gift, all maintenance hours have been reset. Press enter to continue");
  String start_game = Input.nextLine();
  double fuel = 1000000;

  // Game:
    // Menu
  for (int i = 0; i < 1000000; i++){
  System.out.println();
  System.out.println("Menu for the game:");
  System.out.println();
  System.out.println("1 = See Inventory (Cash)");
  System.out.println("2 = See Fleet and Specifics");
  System.out.println("3 = Depart Routes");
  System.out.println("4 = Maintenance");
  System.out.println("5 = Plane Market");
  System.out.println("6 = Create Routes");
  System.out.println("7 = Buy Fuel");
  System.out.println("8 = Exit Game");
  System.out.println("");
  int Menu = Input.nextInt();

    // Main Body
  switch(Menu){
    case 1:
    Thread.sleep(1000);
    System.out.println();
    System.out.println("Company: " + name);
    System.out.println("CEO: " + CEO);
    System.out.println("You have " + cash + " dollars in your account.");
    System.out.println("✈");
    break;

    case 2:
    System.out.println("You have " + Fleet.size() + " planes. Here are their specs:");
    System.out.println();
    System.out.println("Model, Price, Range, Capacity, MPG, Speed, flight hours, and whether a route is assigned.");
    for (int j = 0; j < Fleet.size(); j++){
      System.out.println(Fleet.get(j));
      Thread.sleep(1000);
      System.out.println();
    }
    System.out.println("✈");
    System.out.println("Here are your routes, which correspond to your fleet.");
    System.out.println();
    System.out.println("Destination, Distance, and Demand");
    for (int q = 0; q < Routes.size(); q++){
     System.out.println(Routes.get(q).toString()); 
    }
    System.out.println("✈");
    break;

    case 3:
    double a = Fleet.size(); // For Calculating Gas consumption
    double bb = 0;
    for (int f = 0; f < Routes.size(); f++){
     double bbb = Routes.get(f).gasconsumption(Fleet.get(f).getMPG(), Routes.get(f).getDistance());
      bb+=bbb;
    }
    fuel-=bb; // Amount of fuel left.
    if (fuel > 0){
    int amount_of_routes = Routes.size();
      Thread.sleep(1000);
      System.out.println();
      System.out.println("Departing flights.... waiting for planes to reach destination.");
      double revenue = 0;
      r = 0;
      for (int g = 0; g < amount_of_routes; g++){
      r = Routes.get(g).departRoutes(Routes.get(g).getDistance(), Fleet.get(g).getCapacity(), Routes.get(g).getDemand());
      revenue+=r;
      }

      for (int k = 0; k < amount_of_routes; k++){
        double m;
        m = Fleet.get(k).getMaintainHours((int)Fleet.get(k).getSpeed(),((int) Routes.get(k).getDistance()));
      }
      cash+=revenue; // Adding route revenue
      System.out.println("You have departed your planes and now you've earned : " + revenue + " dollars!");
    }
    else{
      fuel+=bb;
      System.out.println("You do not have enough fuel. Buy more fuel and then try again.");
    }
    System.out.println("✈");
    break;
    case 4:
    Thread.sleep(1000);
    System.out.println();
    System.out.println("Welcome to the maintenance hangar for your airline. Here are the Hours on your planes:");
    for (int j = 0; j < Fleet.size(); j++){
      System.out.println(Fleet.get(j).getMaintainHours1());
    }
    System.out.println("Do you want to undergo maintenace? Know that if hours become negative then the fee is very high. Press 1 to start maintanence, press 2 to not undergo maintanence.");
    int Maintain = Input.nextInt();
    switch(Maintain){
    case 1:
    int maintain_cost = 0;
    System.out.println("Cost for the maintanence:");
    for (int x = 0; x < Fleet.size(); x++){
    double needs_maintain;
    needs_maintain = (Fleet.get(x).getMaintanence((double) (Fleet.get(x).getMaintainHours1())));
    maintain_cost+=needs_maintain;
    }
    System.out.println(maintain_cost);
    System.out.println("Press 1 to maintain planes, and 2 to abort process (for a small fee)");

    int confirm_maintain = Input.nextInt();
    switch(confirm_maintain){

    case 1:
    System.out.println("Undergoing maintenance, please wait.");
    for (int y = 0; y < Fleet.size(); y++){
      Thread.sleep(2000);
      Fleet.get(y).resetMaintainHours();
    }
    cash-=maintain_cost;
    System.out.println("Maintanence completed, hours reset.");
    break;

    case 2:
    double fee = (Math.random()+1)*100000;
    System.out.println("Maintanence aborted. A small fee of $" + fee + "will be extracted.");
    cash-=fee;
    break;
    }
    break;
    case 2:
    System.out.println("Maintanence aborted.");
    Thread.sleep(1000);
    break;
    }
    System.out.println("✈");
    break;

    case 5:
    if (Fleet.size() < 20){ 
    System.out.println("Welcome to the plane shop. Here are a list of planes: You have $" + cash + ".");
    System.out.println();
    System.out.println("Boeing Planes:");
    System.out.println("1. 737-800; $1000000");
    System.out.println("2. 787-8; $8000000");
    System.out.println("3. 757-200; $3500000");
    System.out.println("4. 747-400; $35000000");
    System.out.println();
    System.out.println("Airbus Planes:");
    System.out.println("5. A320-100; $2000000");
    System.out.println("6. A340-200; $7000000");
    System.out.println("7. A350-1000; $30000000");
    System.out.println("8. A380-800; $50000000");
    System.out.println("What plane do you want to purchase?");
    int buy_plane = Input.nextInt();
    switch(buy_plane){
      case 1:
      if (Menu == 5 && cash > 1000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of 737-800, press 2 to abort.");
      int buy737 = Input.nextInt();
      switch(buy737){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("737-800");
        EmptyPlanes.get(0).changePrice(1000000);
        EmptyPlanes.get(0).changeRange(3582);
        EmptyPlanes.get(0).changeCapacity(150);
        EmptyPlanes.get(0).changeSpeed(558);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=1000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");
      
        case 2: // Abort 737 purchase.
        break;
      }
      break;
      }
      break;
      case 2:
      if (Menu == 5 && cash > 3000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of 787-8, press 2 to abort.");
      int buy787 = Input.nextInt();
      switch(buy787){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("787-8");
        EmptyPlanes.get(0).changePrice(8000000);
        EmptyPlanes.get(0).changeRange(7305);
        EmptyPlanes.get(0).changeCapacity(230);
        EmptyPlanes.get(0).changeSpeed(593);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=8000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign to route ASAP.");
      
        case 2: // Abort 787 purchase.
        break;
      }
      break; 
    }
      break;
      case 3:
      if (Menu == 5 && cash > 2500000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of 757-200, press 2 to abort.");
      int buy757 = Input.nextInt();
      switch(buy757){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("757-200");
        EmptyPlanes.get(0).changePrice(3500000);
        EmptyPlanes.get(0).changeRange(4488);
        EmptyPlanes.get(0).changeCapacity(200);
        EmptyPlanes.get(0).changeSpeed(528);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=3500000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");
      
        case 2: // Abort 757 purchase.
        break;
  }
  break;
  }
      break;
      case 4:
      if (Menu == 5 && cash > 35000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of 747-400, press 2 to abort.");
      int buy747 = Input.nextInt();
      switch(buy747){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("747-400");
        EmptyPlanes.get(0).changePrice(35000000);
        EmptyPlanes.get(0).changeRange(8357);
        EmptyPlanes.get(0).changeCapacity(575);
        EmptyPlanes.get(0).changeSpeed(614);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=35000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");
      
        case 2: // Abort 747 purchase.
        break;
  }
    break;
}
break;
      case 5:
      if (Menu == 5 && cash > 2000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of A320-100, press 2 to abort.");
      int buy320 = Input.nextInt();
      switch(buy320){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("A320-100");
        EmptyPlanes.get(0).changePrice(2000000);
        EmptyPlanes.get(0).changeRange(5750);
        EmptyPlanes.get(0).changeCapacity(107);
        EmptyPlanes.get(0).changeSpeed(558);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=2000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");
      
        case 2: // Abort A320 purchase.
        break;
}
    break;
}
break;
        case 6:
        if (Menu == 5 && cash > 7000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of A340-200, press 2 to abort.");
      int buy340 = Input.nextInt();
      switch(buy340){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("A340-200");
        EmptyPlanes.get(0).changePrice(7000000);
        EmptyPlanes.get(0).changeRange(8000);
        EmptyPlanes.get(0).changeCapacity(240);
        EmptyPlanes.get(0).changeSpeed(558);
        EmptyPlanes.get(0).changeMPG(3);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=7000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");
      
        case 2: // Abort A340 purchase.
        break;
}
      break;
}
break;
        case 7:
        if (Menu == 5 && cash > 30000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of A350-1000, press 2 to abort.");
      int buy350 = Input.nextInt();
      switch(buy350){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("A350-1000");
        EmptyPlanes.get(0).changePrice(30000000);
        EmptyPlanes.get(0).changeRange(8700);
        EmptyPlanes.get(0).changeCapacity(360);
        EmptyPlanes.get(0).changeSpeed(560);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=30000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");
      
        case 2: // Abort A350 purchase.
        break;
      }
      break;
        }
        break;
        case 8:
        if (Menu == 5 && cash > 50000000 && Fleet.size() < 20){
      System.out.println("Press 1 to continue with purchase of A380-800, press 2 to abort.");
      int buy350 = Input.nextInt();
      switch(buy350){
        case 1:
        System.out.println("Purchase in process, please wait.");
        EmptyPlanes.get(0).changeModel("A380-8000");
        EmptyPlanes.get(0).changePrice(50000000);
        EmptyPlanes.get(0).changeRange(9569);
        EmptyPlanes.get(0).changeCapacity(615);
        EmptyPlanes.get(0).changeSpeed(683);
        EmptyPlanes.get(0).changeMPG(1);
        EmptyPlanes.get(0).resetMaintainHours();
        Fleet.add(EmptyPlanes.get(0));
        EmptyPlanes.remove(0);
        Thread.sleep(2000);
        cash-=50000000;
        System.out.println("Purchase finished, check new planes in Fleet and assign route ASAP.");

        case 2: // Abort A380 purchase.
        break;
    }
    break;
    }
    break;
} // Plane buying switch
break;
} // Buying Planes (Only if fleet is smaller than 20.)
else{
  System.out.print("Your fleet is equal to the limit of 20 planes. Keep playing and maintain your routes, or start over.");
}
System.out.println("✈");
  break; // for large Case 5: (Buying Planes).

  case 6:
  if (cash > 100000 && Fleet.get(Fleet.size()-1).getRoute() == false){
  System.out.println("Welcome! Here you can make routes for your newly bought planes. The game will automatically assign the route of your choice to the last plane you've bought, which means after each plane you buy you MUST assign it a route. All routes cost $100,000 to create.");
  System.out.println();
  System.out.println("Here is your plane specs: " + Fleet.get(Fleet.size()-1).toString());
  System.out.println("Possible Destinations:");
  System.out.println();
  System.out.println("1. Los Angeles; 2475 Miles");
  System.out.println("2. London Heathrow; 3440 Miles");
  System.out.println("3. Dubai; 6841 Miles");
  System.out.println("4. Delhi; 7308 Miles");
  System.out.println("5. Singapore; 9542, Miles");
  System.out.println("6. Tokyo, 6762, Miles");
  System.out.println("7. Johannesburg; 7975 Miles");
  System.out.println("8. Paris; 3625 Miles");
  System.out.println("9. Buenos Aires; 5297 Miles");
  System.out.println("Choose a destination.");
  int new_route = Input.nextInt();
  switch(new_route){
    case 1: 
    System.out.println("Do you want to create a Route to Los Angeles? 1 is yes, 2 if no. ");
    int la = Input.nextInt();
    switch(la){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Los Angeles");
      EmptyRoutes.get(0).changeDistance(2475);
      EmptyRoutes.get(0).changeDemand(0.7);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    break;

    case 2:
    System.out.println("Do you want to create a Route to London Heathrow? 1 is yes, 2 if no. ");
    int lon = Input.nextInt();
    switch(lon){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("London Heathrow");
      EmptyRoutes.get(0).changeDistance(3440);
      EmptyRoutes.get(0).changeDemand(0.65);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    break;

    case 3:
    if (Fleet.get(Fleet.size()-1).getRange() > 6841){
    System.out.println("Do you want to create a Route to Dubai? 1 is yes, 2 if no. ");
    int dh = Input.nextInt();
    switch(dh){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Dubai");
      EmptyRoutes.get(0).changeDistance(2475);
      EmptyRoutes.get(0).changeDemand(0.6);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    }
    break;

    case 4:
    if (Fleet.get(Fleet.size()-1).getRange() > 7308){
    System.out.println("Do you want to create a Route to Delhi? 1 is yes, 2 if no. ");
    int de = Input.nextInt();
    switch(de){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Delhi");
      EmptyRoutes.get(0).changeDistance(7308);
      EmptyRoutes.get(0).changeDemand(0.7);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    }
    break; 

    case 5:
    if (Fleet.get(Fleet.size()-1).getRange() > 9542){
    System.out.println("Do you want to create a Route to Singapore? 1 is yes, 2 if no. ");
    int si = Input.nextInt();
    switch(si){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Singapore");
      EmptyRoutes.get(0).changeDistance(9542);
      EmptyRoutes.get(0).changeDemand(0.6);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    }
    break;
    case 6:
    if (Fleet.get(Fleet.size()-1).getRange() > 6762){
    System.out.println("Do you want to create a Route to Tokyo? 1 is yes, 2 if no.");
    int tk = Input.nextInt();
    switch(tk){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Tokyo");
      EmptyRoutes.get(0).changeDistance(6762);
      EmptyRoutes.get(0).changeDemand(0.7);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      
      case 2:
      break;
    }
    }
    break;  

    case 7:
    if (Fleet.get(Fleet.size()-1).getRange() > 7308){
    System.out.println("Do you want to create a Route to Johannesburg? 1 is yes, 2 if no. ");
    int jh = Input.nextInt();
    switch(jh){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Johannesburg");
      EmptyRoutes.get(0).changeDistance(7975);
      EmptyRoutes.get(0).changeDemand(0.7);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    }
    break; 
    
    case 8:
    if (Fleet.get(Fleet.size()-1).getRange() > 3625){
    System.out.println("Do you want to create a Route to Paris? 1 is yes, 2 if no. ");
    int pr = Input.nextInt();
    switch(pr){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Paris");
      EmptyRoutes.get(0).changeDistance(3625);
      EmptyRoutes.get(0).changeDemand(0.65);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    }
    break; 

    case 9:
    if (Fleet.get(Fleet.size()-1).getRange() > 5297){
    System.out.println("Do you want to create a Route to Buenos Aires? 1 is yes, 2 if no. ");
    int ba = Input.nextInt();
    switch(ba){
      case 1:
      System.out.println("Please wait, route being created.");
      Fleet.get(Fleet.size()-1).changeRouteStatus();
      EmptyRoutes.get(0).changeDestination("Buenos Aires");
      EmptyRoutes.get(0).changeDistance(5297);
      EmptyRoutes.get(0).changeDemand(0.75);
      Routes.add (EmptyRoutes.get(0));
      EmptyRoutes.remove(0);
      System.out.println("Your route has been created, you can now depart it.");
      cash-=100000;
      break;
      case 2:
      break;
    }
    }
    break; 
    }
    break;
  }
  else{
    System.out.println("You do not have enough funds to create a route, or all of your planes are on a route. Depart routes to earn more money.");
  }
  System.out.println("✈"); 
  break;

  case 7:
  double fuel_price = Fuel.getFuelPrice();
  System.out.println("Welcome to the fuel shop. Currently, fuel prices are at $" + fuel_price + " dollars per gallon of fuel. You have " + fuel + " gallons of fuel.");
  System.out.println("Press 1 to buy fuel, press 2 to abort.");
  int fuel_buy = Input.nextInt();
  switch(fuel_buy){
    case 1:
    System.out.println("How much fuel do you want to buy?");
    double fuel_amount = Input.nextInt();
    double fuel_cost;
    fuel_cost = fuel_amount*fuel_price;
    if (fuel_cost < cash){
      System.out.println("The cost is $" + fuel_cost);
      Thread.sleep(1000);
      fuel+=fuel_amount;
      cash-=fuel_cost;
      System.out.println("Fuel purchase done, you have " + fuel + " gallons.");
    }
    else if (fuel_cost >= cash){
      System.out.println("You don't have enough money to buy that amount of fuel. Try again later.");
      Thread.sleep(1000);
    }
    break;

    case 2:
    System.out.println("Purchase aborted");
  }
  System.out.println("✈");
  break;

  case 8:
  System.out.println("Are you sure you want to end game? 1 if no, 2 is yes.");
  int quit_game = Input.nextInt();
  switch(quit_game){
    case 1:
    break;

    case 2:
    System.out.println("Thanks for playing!");
    System.out.println("Credits:");
    System.out.println("Developed by: Srinath Iyer");
    System.out.println("Concept: Xombat Development");
    System.out.println("All rights reserved, 2020");
    System.out.println("✈");
    System.out.println();
    System.out.println("Press enter to end game.");
    String end_game = Input.nextLine();
    Input.close();
    return;

  }
  break;
} // Switch
} // Game for loop
} // String args
} // Main