package Date2804;

import java.util.HashSet;
import java.util.Scanner;

public class Slide53 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          HashSet<String> hs = new HashSet<>();
          hs.add("A");
          hs.add("B");
          hs.add("C");
          hs.add("C");
          System.out.println("B :" + hs);
          System.out.println("Nhap phan tu can them:");
          String Eadd = sc.nextLine();
          hs.add(Eadd);
          System.out.println("A :" + hs);
     }
}
