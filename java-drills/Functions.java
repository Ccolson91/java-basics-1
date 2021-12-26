public class Functions {
  public static void main(String[] args){
    helloWorld();
    greeting("Christian");
    System.out.println(add(5, 7));
    System.out.println(faveColorFinder("green"));
    System.out.println(thatsOdd(103));
    int[] testArr = {75, 84, 119, 225, 64, 101, 99, 360, 5, 88};
    System.out.println(Arrays.toString(bigOrSmall(testArr)));
  }

    private static void helloWorld(){
      System.out.println("Hello World");
    }

    private static void greeting(String name){
      System.out.println("Hello, " + name);
    }

    private static int add(int a, int b){
      int sum = a + b;
      return sum;
    }
    
    private static String faveColorFinder(String color){
      if(color.equals("red")){
        return "red is a great color";
      }
      else if(color.equals("green")){
        return "green is a solid favorite color";
      }
      else if(color.equals("black")){
        return "so trendy";
      }
      else {
        return "you need to evaluate your favorite color choice";
      }
    }

    private static String thatsOdd(int num){
      if(num % 2 == 0){
        return "That's not odd!";
      }
      else {
        return "That is odd indeed";
      }
    }

    private static String[] bigOrSmall(int[] arr){
      String[] answers = new String[10];
      for(int i = 0; i < arr.length; i++){
        if(arr[i] > 100){
          answers[i] = "Big";
        }
        else {
          answers[i] = "Small";
        }
      }
      return answers;
    }
}