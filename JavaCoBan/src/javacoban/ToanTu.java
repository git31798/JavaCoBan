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
public class ToanTu {
    public static void main(String[] args) {
        // + , - , * , /, +=, -=, *=, /=
        int x = 2;
        int y = 3;
        int a = x + y;// hay x += y hay x = x + y
        int b = x - y;//hay x -= y hay x = x - y
        int c = x * y;//hay x *= y hay x = x * y
        int d = x / y;//hay x /= y hay x = x / y
        
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // ---------------------
        a = x++; // gắn rồi cộng
        a = ++x; // cộng rồi gắn
        // Nâng kiểu
        byte e = 1;
        short f = 2;
        int g = 3;
        long l = 3L;
        long A = e + f + g + l; // chỉ được công vs kiểu nhỏ hơn
        int B = e + f + g + l; // báo lỗi vì biến l kiểu long lớn hơn int
    }
}
