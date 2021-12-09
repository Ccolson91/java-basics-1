public class FizzBuzz {
  public static void main(String[] args) {
    // This calls the fizzBuzz100 method below 
    fizzBuzz100();
  }
  // Creates a new function fizzBuzz100
  private static void fizzBuzz100() {
    // for loop: initializes a starting index of 1; sets condition to be true while index is less than or equal to 100; updates index after executing code block
    for(int i = 1; i <= 100; i++) {
      // if the remainder of index modulus 3 equals 0 print "fizz"
      if((i % 3) == 0)
        System.out.println("fizz");
      // if the remainder of index modulus 5 equals 0 print "buzz"
      else if ((i % 5) == 0)
        System.out.println("buzz");
      // if the remainder of index modulus 5 equals 0 and the remainder of index modulus 3 equals 0 print "fizzbuzz"
      else if (((i % 5) == 0) && ((i % 3) == 0))
        System.out.println("fizzbuzz");
      // for everything else, print the index
      else 
        System.out.println(i);
    }
  }
}