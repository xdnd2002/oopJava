import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("Nhap nam sinh cua ban: ");
        int birthYear = scanner.nextInt();

        int age = 2023 - birthYear; 

        if (age < 16) {
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        } else if (age >= 16 && age < 18) {
            System.out.println("Ban " + name + " o do tuoi truong thanh.");
        } else {
            System.out.println("Ban " + name + " da gia.");
        }

        scanner.close();
    }
}