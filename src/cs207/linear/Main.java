package cs207.linear;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
  // creates a priority queue of strings that is ordered by string length
  // add a few strings
  // remove the strings

  public static void main (String[] args) throws Exception {
    
    Comparator<String> comp = new Comparator<String>() {
      public int compare(String str1, String str2) {
        return str1.compareTo(str2);
      }

    }; //comparator
    
    BuiltinPriorityQueue<String> queue = new BuiltinPriorityQueue<String>(3, comp);
    
  } // main


} // class
