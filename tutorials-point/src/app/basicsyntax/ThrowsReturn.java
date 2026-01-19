package app.basicsyntax;
import java.lang.AutoCloseable;

interface Foolx extends AutoCloseable{};


class FoolBar implements Foolx {
  public String name;
  FoolBar() {}
  
  @Override
  public void close()  throws Exception {}
}
public class ThrowsReturn {

  public static double teste(int a, int b) throws IllegalArgumentException, Exception {
    try (
      Foolx x = new FoolBar();
  ) {
      return a / b;
      
    } catch (RuntimeException e) {
      System.out.println("vaffanculo cazzo: " + e);
      throw new IllegalArgumentException(e);
    }
  }

  public static void main(String[] args) throws RuntimeException, Exception {
    int x = (int) teste(10, 2);
    System.out.println("x here: " + x);
  }
}
