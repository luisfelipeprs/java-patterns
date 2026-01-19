package app.whatever;

public class Types {
  char myChar = 'a';
  static String myString = "ABC";

  public static void main(String[] args) {
  Types type = new Types();
  type.myChar = 'b';
  Types.myString = "CBA";
  
  System.out.println(myString + " " + type.myChar);
  }
}
