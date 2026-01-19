package app.basicsyntax;

class Pai {
  String name = "Elon";

  class Filho {
    String name = "Sam Altman";
  }
}

public class InternalClass {
  public static void main(String[] args) {
    var pai = new Pai();
    Pai.Filho filho = pai. new Filho();
    System.out.println("Pai name: " + pai.name);
    System.out.println("Filho name: " + filho.name);
  }
}
