/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

/**
 *
 * @author Admin
 */
public class Ham {
    public static void main(String[] args) {
        System.out.println(tongHaiSo());
        System.out.println(hieuHaiSo(3, 4));
        xinChao();
    }
    // hàm có giá trị trả về tương ứng
    public static int tongHaiSo(){
        int x = 1;
        int y = 2;
        int tong = x +y;
        return tong;
    }
    // hàm với đối số truyền vào
    public static int hieuHaiSo(int x, int y){
        int hieu = x - y;
        return hieu;
    }
    // hàm không có giá trị trả về
    public static void xinChao(){
        System.out.println("Hello World");
    }
}
