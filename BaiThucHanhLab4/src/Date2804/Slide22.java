package Date2804;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
     public static void main(String[] args) {
          ArrayList<Integer> arrList = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
          int a;
          do {
               System.out.print("Nhap vao so luong phan tu :");
               a = sc.nextInt();
          } while (a <= 0);
          for (int i = 0; i < a; i++) {
               System.out.printf("nhap vao gia tri cua phan tu %d ", i);
               int c = sc.nextInt();
               arrList.add(c);
          }
          System.out.println("danh sach ban dau:");
          HienThi(arrList);
          arrList.sort((o1, o2) -> o1.compareTo(o2));
          System.out.println("danh sach sau sap xep giam dan");
          HienThi(arrList);
          int max, min;
          min = arrList.get(0);
          max = arrList.size();
          System.out.print("Max: " + max + " Min:" + min);
     }

     public static void HienThi(ArrayList<Integer> Arr) {
          for (int i = 0; i < Arr.size(); i++) {
               System.out.print(Arr.get(i) + "\t");
          }
          System.out.println();
     }
}
