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
public class CauHoiTracNghiem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Lệnh tiếp tục vòng lặp tropng java là gì?");
            System.out.println("1. break");
            System.out.println("2. continue");
            System.out.println("Bạn bấm q để thoát");
            String luaChon = sc.nextLine();
            if (luaChon.equals("1")) {
                System.out.println("Bạn đã trả lời sai");
                break;
            } else if (luaChon.equals("2")) {
                System.out.println("Bạn đã trả lời đúng");
                break;
            } else if (luaChon.equals("q")) {
                break;

            } else {
                System.out.println("Vui lòng chọn đáp án!");
            }
        }
    }
}
