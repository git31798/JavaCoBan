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
public class Mang {
    
    public static void main(String[] args) {
        // khai báo mảng cách 1
        int[] mangInt = new int[3]; 
        mangInt[0] = 1;
        mangInt[1] = 2;
        mangInt[2] = 3;
        // khai báo mảng cách 2
        long[] mangLong = {1,2,3,4,5};
         // khai báo mảng cách 3
        double mangDouble[] = new double[3];
        //Xuất mảng
        System.out.println("Mảng Int:");
        for(int i =0; i < mangInt.length; i++){
            System.out.println(mangInt[i]);
        }
        
    }
}
