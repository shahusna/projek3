/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktiviti.pkg6.pkg2;

import java.io.IOException;

/**
 *
 * @author Dell
 */
public class Soalan_4 {
    public static void main(String args[])
     throws java.io.IOException {
            char aksara, jawapan = 'A';
    
    System.out.println("Sila pilih mana-mana satu aksara A-Z (Huruf Besar).");
    
    System.out.print("Tekaan huruf anda: ");
    aksara = (char) System.in.read();
    
    if (aksara == jawapan){
        System.out.println("** Jawapan Anda Tepat**");
    }else{
        System.out.println("....Maaf Jawapan Anda Salah!.");
    }
    if (aksara < jawapan){
        System.out.println("Jawapan anda tersasar awal");
    }else{
        System.out.println("Jawapan anda tersasar jauh ke depan");
        
    }
    }
    }
          

