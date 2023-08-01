import java.util.ArrayList;

interface StringFunction{
    String run(String str);
}


public class Lambdas {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );

    StringFunction exclaim = (s) -> s+"!";
    StringFunction ask = (s) -> s+"?";
    printFormatted("Hello ",exclaim);
    printFormatted("Hello ",ask);
  }

  public static void printFormatted(String str, StringFunction format){
    String result=format.run(str);
    System.out.println(result);
  }
}