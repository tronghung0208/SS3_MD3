package chuanbi.baitap4;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("MENU");
            System.out.println("1.In ra hình tam giác");
            System.out.println("2.In ra hình VN");
            System.out.println("3.In ra hình vuông");
            System.out.println("4.Thoát");
            System.out.println("Lựa chọn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");
                    System.out.println(" * * * * * * ");

                    break;
                case 3:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");

                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Số nhập không hợp lệ, mời nhập lại");
            }
        }
    }
}
