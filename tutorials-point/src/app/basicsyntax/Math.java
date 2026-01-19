package app.basicsyntax;

public class Math {
  public static void main(String[] args) {
    int result = (int) new Math().divide(10, 2);
    System.out.println("REsult here: " + result);
  }

  /**
    * @param dividendo
    * @param divisor
    * @throws IllegalArgumentException if divisor is zero
  */
  private double divide(double dividendo, double divisor) {
    if (divisor == 0) throw new IllegalArgumentException("divisor cannot be zero");

    return dividendo / divisor;
  }
}