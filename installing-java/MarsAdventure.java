import java.util.Scanner;

class MarsAdventure {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello Earthling! What is you name?");

    String name = input.nextLine();
    System.out.println("It is a pleasure to meet you " + name);

    System.out.println("Looks like you need a spacesuit if you plan on staying awhile. Which color do you prefer?");

    String color = input.nextLine();
    System.out.println("Let me check if we have a " + color + "spacesuit left in the back. Ah yes, here it is! What size do you need?");

    String size = input.nextLine();
    System.out.println("Perfect! This happens to be the last " + color + "spacesuit we have and its also a " + size + "! ");

    System.out.println("Now that we've got your spacesuit equipped, can you tell me where you'd like to visit?");

    String place = input.nextLine();
    System.out.println("That is a great choice! I haven't been to " + place + "in a thousand years! You'll need a ticket on the Mars Express to get there. Do you have a ticket?");
    
    String answer = input.nextLine();
    System.out.println("What's that you say? " + answer + "...Better come with me first just to make sure. We wouldn't want you getting lost out here in Space!");
  }
}