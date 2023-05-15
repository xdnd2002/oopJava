package Date2804;

import java.util.ArrayList;

public class Slide20 {
     public static void main(String[] args) {
          ArrayList<String> arr = new ArrayList<>();
          arr.add("A");
          arr.add("B");
          arr.add("C");
          arr.add(3, "E");
          arr.remove(0);
          arr.set(2, "F");
          for(int i = 0; i < arr.size(); i++){
               System.out.println(arr.get(i));
          }
          System.out.println("So luong phan tu la:" + arr.size());
     }
}
