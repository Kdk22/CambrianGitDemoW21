import java.util.Random;
import java.util.Scanner;

class Dice{
  private int numSides;
  private int sideUp;
  private String diceType = "";

  Random randVal = new Random();

  Dice(){
    
    this.diceType = "d6";
    this.numSides = 6;
    int numberLimit = this.numSides + 1;
    int randomValue = randVal.nextInt(numberLimit);
    this.sideUp = randomValue;
        
  }

   Dice(int numSides){
    this.diceType = "d"+numSides;
    this.numSides = numSides;
    this.sideUp = randVal.nextInt(this.numSides+1);
  
  }
  
  Dice(int numSide, String diceType){
    this.diceType = diceType;
    this.numSides = numSide;
    this.sideUp = randVal.nextInt(this.numSides+1);
  }


  public int getNumSide(){
    return this.numSides;
  }
  public int getSideUp(){
    return this.sideUp;
  }
  public void roll(){
    this.sideUp = randVal.nextInt(this.numSides+1);
  }
  public String getDiceType(){
    return this.diceType;
  }

}

public class RollDice {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Creating a default die.");
    Dice d6 = new Dice();
    d6.roll();
    System.out.println("Crated a d6 with side up " +d6.getSideUp());

    System.out.println("How many sides would you like: ");
    int sides = sc.nextInt();
    System.out.println("Creating a die with " + sides + "sides");
    Dice d1 = new Dice(sides);
    d1.roll();
    System.out.println("Created a " + d1.getDiceType() + " dice with side up "+ d1.getSideUp());
    System.out.println("How many sides would you like: ");
    int diceSide = sc.nextInt();
    System.out.println("What is the name of your die: ");
    sc.nextLine(); // Consume newline left over created by nextint
    String dieType = sc.nextLine();
    Dice d2 = new Dice(diceSide, dieType);
    d2.roll();
    System.out.println("Created a " + d2.getDiceType() + " dice with side up " + d2.getSideUp());

    System.out.println("Bonus"+"\n" + "Trying Yahtzee ");
    int count = 1;
    
      Dice d3 = new Dice();
      Dice d4  = new Dice();
      Dice d5 = new Dice();
      Dice d8 = new Dice();
      Dice d7 = new Dice();
    while (true) {
      count ++;
      d3.roll();
      d4.roll();
      d5.roll();
      d8.roll();
      d7.roll();
      if((d3.getSideUp() == d4.getSideUp()) && ( d4.getSideUp() == d5.getSideUp()) &&
          ( d5.getSideUp()==d7.getSideUp())){
        System.out.println("It took " +count + " rolls to  get Yahtzee");
        break;
      }
      
    }

  }
}
