// BEWARE: THIS IS NON-FUNCTIONAL CODE


public class FizzBuzz2 {
  public static void main(String[] args){
    int status = -1;

    for(int fbNum = 1; i <= 100; i++){
      if(fbNum % 3 == 0 && fbNum % 5 != 0){
        status = 1;
      }
      else if(fbNum % 5 == 0 && fbNum % 3 != 0){
        status = 2;
      }
      else if(fbNum % 3 == 0 && fbNum % 5 == 0){
        status = 3;
      }
      else if(fbNum % 3 != 0 && fbNum % 5 !=0){
        status = 4;
      }
    }
    switch(status){
      case 1: 
        System.out.println("Fizz");
        return;
      case 2: System.out.println("Buzz");
        return;
      case 3: 
        System.out.println("FizzBuzz");
        return;
      case 4: 
        System.out.println(fbNum);
        return;
      default:
        System.out.println("Something went wrong");
        return;
    }
  }
 
}