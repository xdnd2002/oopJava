package Date2804;

import java.util.ArrayList;
import java.util.Iterator;



public class Slide18 {
     public static void main(String[] args) {
          ArrayList<String> arr = new ArrayList<>();
          arr.add("A");
          arr.add("B");
          arr.add("C");
          Iterator<String> it = arr.iterator();
          while (it.hasNext()) {
               System.out.print(it.next() + "\t");
          }

     }
}
