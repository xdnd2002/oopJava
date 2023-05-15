package Date2804;

import java.util.LinkedHashSet;

public class Slide59 {
     public static void main(String[] args) {
          LinkedHashSet<String> set = new LinkedHashSet<>();
          set.add("apple");
          set.add("banana");
          set.add("orange");
          set.add("grape");
          System.out.println("B :" + set);

          boolean isRemoved = set.remove("banana"); // Xóa phần tử "banana"
          if (isRemoved) {
               System.out.println("A :" + set);
          } else {
               System.out.println("Not found !");
          }
     }
}
