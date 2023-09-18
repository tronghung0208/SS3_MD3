package chuanbi.baitap2;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money, interresRate; // số tiền gửi và lãi suất
        int month; //số tháng gửi
        System.out.println("Nhập số tiền gửi");
money=sc.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month=sc.nextInt();
        System.out.println("Nhập tỉ lệ lãi suất/năm");
        interresRate=sc.nextDouble();

        double totalRate=0;
        for (int i = 1; i <= month; i++) {
            totalRate+=month*((interresRate/100)/12)*month;
        }
        System.out.println("Tổng tiền lãi sau "+month+" tháng là: "+totalRate);
    }
}
