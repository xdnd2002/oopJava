package Date2804;

import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19 {
     public static void main(String[] args) {
          ArrayList<String> arr = new ArrayList<>();
          arr.add("A");
          arr.add("B");
          arr.add("C");
          ListIterator<String> it = arr.listIterator();
          while (it.hasNext()) {
               System.out.print(it.next() + "\t");
          }

     }
}
