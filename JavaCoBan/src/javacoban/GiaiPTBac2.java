/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaiPTBac2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        double denta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                if (c == 0) {
                    System.out.println("Phương trình có nghiệm x = 0");
                } else {
                    System.out.println("Phương trình có một nghiệm x = " + -c / b);
                }

            }
        } else if (denta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + -b / (2 * a));
        } else if (denta > 0) {
            System.out.println("Phương trình có nghiệm kép x1 = " + (-b + Math.sqrt(denta)) / (2 * a) + " và x2 = " + (-b - Math.sqrt(denta)) / (2 * a));
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
