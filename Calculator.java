/**
*A simple arithmetic calculator that performs add, subtract, muliply,
*divide and the modulus on two integers.
*/

public class Calculator{
  public Calculator(){

  }

  public int add(int a, int b)
  {
    return a+b;
  }

  public int subtract(int a, int b)
  {
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b)
  {
      return a/b;
  }

  public int modulo(int a, int b){
    return a%b;
  }

  public static void main(String[] args)
  {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(9,6));
    System.out.println(myCalculator.divide(96,12));
    System.out.println(myCalculator.modulo(16,3));
  }
}
