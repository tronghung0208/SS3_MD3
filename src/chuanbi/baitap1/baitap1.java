package chuanbi.baitap1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn kiểm tra: ");
        int checkInt = sc.nextInt();
        if (checkNumber(checkInt)) {
            System.out.println(checkInt + ": Là số nguyên tố");
        } else {
            System.out.println(checkInt + ": Không phải là số nguyên tố");
        }
    }
    public static boolean checkNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
