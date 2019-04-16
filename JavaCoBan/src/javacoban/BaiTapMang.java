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
public class BaiTapMang {

    Scanner sc = new Scanner(System.in);
    private int[] m = new int[5];

    public void input() {
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
    }

    public void output() {
        for (int x : m) {
            System.out.println(x);
        }
    }

    public void sapXepTangDan() {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] > m[j]) {
                    int tam = m[i];
                    m[i] = m[j];
                    m[j] = tam;
                }
            }
        }
    }
    public static void main(String[] args) {
        BaiTapMang bt = new BaiTapMang();
        bt.input();
        System.out.println("Mảng vừa nhập:");
        bt.output();
        bt.sapXepTangDan();
        System.out.println("Mảng sau khi sắp xếp:");
        bt.output();
    }
}
