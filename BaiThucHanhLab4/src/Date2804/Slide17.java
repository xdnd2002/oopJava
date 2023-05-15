package Date2804;

import java.util.ArrayList;

public class Slide17 {
     public static void main(String[] args) {
          ArrayList<String> arr = new ArrayList<>();
          arr.add("A");
          arr.add("B");
          arr.add("C");
          HienThi(arr);
     }

     public static void HienThi(ArrayList<String> arr) {
          for (String number : arr) {
               System.out.print(number + "\t");
          }
     }
}
