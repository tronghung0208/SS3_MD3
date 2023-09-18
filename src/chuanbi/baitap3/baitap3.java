package chuanbi.baitap3;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Nhập số a: ");
        a=sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b=sc.nextInt();

        a=Math.abs(a); // trả về trị tuyệt đối của a và b nếu nhập a,b là số âm
        b=Math.abs(b);

        if (a==0||b==0){
            System.out.println("trị tuyệt đối của tất cả các số khác 0 đều là UCLN");
        }
        while (a!=b){

            if (a>b){
                a=a-b;
                System.out.println("a= "+a);
            }else {
                b=b-a;
                System.out.println("b= "+b);
            }

        }
        System.out.println("ước số chung lớn nhất là: "+a);
    }
}
