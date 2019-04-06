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
public class DocDuLieu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp a: ");
        int a = sc.nextInt();
        System.out.println("Nhâp b: ");
        float b = sc.nextFloat();
        System.out.println("Nhâp c: ");
        double c = sc.nextDouble();
        System.out.println("Nhâp d: ");
        byte d = sc.nextByte();
        System.out.println("Nhâp e: ");
        short e = sc.nextShort();
        System.out.println("Nhâp f: ");
        long f = sc.nextLong();
        System.out.println("Kết quả " + (a + b + c + d + e + f ));
        System.out.println("Nhâp tên: ");
        sc.nextLine();
        
        String g = sc.nextLine();
        System.out.println("Xin chào " + g);
    }
}
