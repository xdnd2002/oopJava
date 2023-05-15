package Date2804;

import java.util.LinkedList;

public class Slide40 {
     public static void main(String[] args) {
          LinkedList<String> lkl = new LinkedList<>();
          lkl.add("A");
          lkl.add("B");
          lkl.add("C");
          System.out.println("B :");
          for (String string : lkl) {
               System.out.println(string);
          }
          lkl.removeLast();
          System.out.println("A :");
          for (String string : lkl) {
               System.out.println(string);
          }
     }
}
