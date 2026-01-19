package app.basicsyntax;

class Fool {
  enum FoolBar {
    MADURO, TRUMP
  }

  FoolBar president;
}

public class JavaEnums {
  public static void main(String[] args) {
    Fool fool = new Fool();
    fool.president = Fool.FoolBar.TRUMP;
    System.out.println(fool.president);
  }
}

