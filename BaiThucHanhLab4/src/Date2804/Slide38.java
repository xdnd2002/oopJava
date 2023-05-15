package Date2804;

import java.util.LinkedList;

public class Slide38 {
     public static void main(String[] args) {
          LinkedList<String> Lk = new LinkedList<>();
          Lk.add("A");
          Lk.add("B");
          Lk.add("C");
          System.out.println(Lk);
          System.out.println(Lk.contains("A"));
          LinkedList<String> Lk1 = new LinkedList<>();
          Lk1.addAll(Lk);
          Lk1.add("E");
          Lk1.add("F");
          Lk1.add("G");
          System.out.println(Lk1);
          Lk1.retainAll(Lk);
          System.out.println(Lk1);
     }
}
