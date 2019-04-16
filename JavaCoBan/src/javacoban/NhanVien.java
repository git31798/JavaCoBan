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
public class NhanVien {

    private String tenString, diaChi;
    private int tuoi;

    public NhanVien() {

    }

    public NhanVien(String tenString, String diaChi, int tuoi) {
        this.tenString = tenString;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public String getTenString() {
        return tenString;
    }

    public void setTenString(String tenString) {
        this.tenString = tenString;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public static void main(String[] args) {
        NhanVien[] nhanViens = new NhanVien[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao gia tri");
        for (int i = 0; i < nhanViens.length; i++) {
            String ten = sc.nextLine();
            String diaChi = sc.nextLine();
            int tuoi = sc.nextInt();
            nhanViens[i] = new NhanVien(ten, diaChi, tuoi);
            //xoa bo nho dem cua ban phim
            sc.nextLine();
        }
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.getTenString() + " " + nv.getDiaChi() + " " + nv.getTuoi() + "\n");
 
        }
    }
}
