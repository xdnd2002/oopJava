import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Slide47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int sum=0;
        int number;
        String arr="";
        do{
            out.println("nhap so nguyen duong");
            number=sc.nextInt();
            sum+=number;
            arr+=number+"+";
        }
        while(sum<=100);


        out.println("tong so da nhap: "+arr.substring(0, arr.length() - 1)+"="+sum);
    }
}
