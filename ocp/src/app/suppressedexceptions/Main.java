package app.suppressedexceptions;

import java.lang.AutoCloseable;

/**
 * @doc https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 */
public class Main {
  public static void main(String[] args) {
    try (
        var teste = new ProblemServiceConcrete();) {
      System.out.println("before throw error");
      throw new Exception("try main exception");
    } catch (Throwable e) {
      System.out.println("Exception here: " + e);
      Throwable[] suppressedExceptionsArr = e.getSuppressed();
      System.out.println("Suppressed exception length: " + suppressedExceptionsArr.length);
      for (Throwable t : suppressedExceptionsArr) {
        String message = t.getMessage();
        System.out.println("Suppressed exception here: " + message);
      }
    }
  }
}

interface ProblemService extends AutoCloseable {
  void close() throws Exception;
}

class ProblemServiceConcrete implements ProblemService {
  @Override
  public void close() throws Exception {
    throw new Exception("problema no close");
  }
}