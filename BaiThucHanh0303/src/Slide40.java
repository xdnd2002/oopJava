import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Slide40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(in);
        out.println("nhap ngay trong tuan(1-7)");
        int day=sc.nextInt();
        switch (day){
            case 1:
                out.println("la ngay chu nhat"); break;
            case 2:
                out.println("la ngay thu 2");break;
            case 3:
                out.println("la ngay thu 3" );break;
            case 4:
                out.println("la ngay thu 4" );break;
            case 5:
                out.println("la ngay thu 5");break;
            case 6:
                out.println("la ngay thu 6");break;
            case 7:
                out.println("la ngay thu 7");break;
            default: out.println("la ngay chu nhat");
        }
    }
}
