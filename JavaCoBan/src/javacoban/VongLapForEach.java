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
public class VongLapForEach {
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for(int x : a){
            System.out.println(x);
        }
        String[] b = {"Hello","Pham","Minh","Tuan"} ;
        for(String s : b){
            System.out.println(s);
        }
    }
}
