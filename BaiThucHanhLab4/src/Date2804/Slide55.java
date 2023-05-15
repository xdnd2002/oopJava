package Date2804;

import java.util.HashSet;
import java.util.Scanner;

public class Slide55 {
     public static void main(String[] args) {
          HashSet<String> set = new HashSet<>();
          set.add("apple");
          set.add("banana");
          set.add("orange");
          set.add("pear");
          System.out.println("B :" + set);
          boolean isRemoved = set.remove("banana");
          if (isRemoved) {
               System.out.println("A :" + set);
          } else {
               System.out.println("Not found !");
          }

     }
}
