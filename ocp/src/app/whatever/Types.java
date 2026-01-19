package app.whatever;

class Chars {
  char myChar = 'a';
  static String myString = "ABC";

  public static void execute() {
    Chars type = new Chars();
    type.myChar = 'b';
    Chars.myString = "CBA";

    System.out.println(myString + " " + type.myChar);
  }
}

class Floats { 
  /**
   * The precision of a floating point value indicates how many digits the value can have after the decimal point. 
   * The precision of float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.
   */
  static float x = (float) 5.5d;
}

public class Types {
  public static void main(String[] args) {
    System.out.println(Floats.x);
  }
}