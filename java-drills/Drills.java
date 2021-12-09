public class Drills {
  public static void main(String[] args) {

    // Variables & Data Types

    String fName = "Luke";
    String lName = "Skywalker";
    String bYear = "19 BBY";
    String home = "Tatooine";
    float heightM = 1.72f;
    float weightKg = 73f;

    // Mathematical Operators

    float purse = 150.00f;
    float droid = -24.3f;
    float boots = -45f;
    purse += droid + boots;
    purse = purse * 2;
    purse -= purse / 10;
    System.out.println(purse);

    // Conditional Statements

    String saberHandle = "black";
    String saberBlade = "purple";

    if(saberHandle == "black" && saberBlade == "purple") 
      System.out.println("This one's mine!");
    else
      System.out.println("Pass");

    String spaceShip = "Mellenium Falcon";

    if(spaceShip == "Mellenium Falcon")
      System.out.println("Let's go!");
    else
      System.out.println("I better hide somewhere.");

    float item = 4.97f;
    boolean recommended = true;

    if(item < 5.00f && recommended == true)
      System.out.println("I'll try it.");
    else 
      System.out.println("No thanks.");

    float drinkPrice = 0.97f;
    int drinkSize = 32;

    if(drinkPrice < 1.00f || drinkSize > 24)
      System.out.println("I'll have the tasty beverage");
    else
      System.out.println("I'll pass");
  } 
}