/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MayTinh {

    Scanner sc = new Scanner(System.in);
    private static int a;
    private static int b;

    public void nhap() {
        System.out.println("Nhập a:");
        a = sc.nextInt();
        System.out.println("Nhập b:");
        b = sc.nextInt();
    }

    public void mayTinh() {
        while (true) {
            System.out.println("----MENU-----");
            System.out.println("1. Cộng (+) ");
            System.out.println("2. Trừ (-) ");
            System.out.println("3. Nhân (*) ");
            System.out.println("4. Chia (/) ");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn chương trình tính");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("a + b = " + (a + b));
                    break;
                case 2:
                    System.out.println("a - b = " + (a - b));
                    break;
                case 3:
                    System.out.println("a * b = " + (a * b));
                    break;
                case 4:
                    System.out.println("a / b = " + (a / b));
                    break;
            }
            if (chon == 5) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        mt.nhap();
        mt.mayTinh();

    }
}
