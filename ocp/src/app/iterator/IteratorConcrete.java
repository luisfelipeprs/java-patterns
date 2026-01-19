package app.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcrete {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Holodomor");
    arr.add("União Sov");
    Iterator<String> it = arr.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
