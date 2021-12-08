/*
A number-guessing game.

greet player
get player name
choose random number b/w 1 & 100
repeat forever:
  get guess
  if guess is incorrect:
    give hint
    increase number of guesses
  else:
    congratulate player
*/
import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    // System.out.println("Hello Christian!");
    Scanner input = new Scanner(System.in);
    // Creates an instance of the Random object
    Random rand = new Random();
    // Call method nextInt and pass in upper range bound
    int number = rand.nextInt(100) + 1;
    System.out.println("Random number is " + number);

    System.out.println("Step right up new contestant! What's your name?");

    String name = input.nextLine();
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number.");
    
    int tryCount = 0;

    while(true) {
      System.out.print("Your guess?");
      int guess = input.nextInt();
      tryCount++;
        if(guess == number){
          System.out.println("Correct! You Win!");
          System.out.println("It took you " + tryCount + " tries!");
          break;
        }
        else if(guess < 0 || guess > 100){
          System.out.println("You fool! Try following directions and picking a valid number between 0 and 100");
        }
        else if(number > guess){
          System.out.println("Nope! The number is higher. Guess again.");
        }
        else if(number < guess){
          System.out.println("Nope! The number is lower. Guess again.");
        } 
        // else {

        // }
          try {
            

          }
          catch (NumberFormatException e) {
            String bad_input = input.next();
            System.out.println("Slow down silly! That is not an integer. Try again");
            continue;
          }
    }
  }
}
