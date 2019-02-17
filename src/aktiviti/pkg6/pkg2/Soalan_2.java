/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktiviti.pkg6.pkg2;

/**
 *
 * @author Dell
 */
import java.util.Calendar;
import java.util.Scanner;
public class Soalan_2 {
    public static void main(String[] args){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int umur;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun anda dilahir: ");
        int thnlahir = input.nextInt();
        umur = year - thnlahir;
        if (umur >= 18){
            System.out.println("Anda sudah layak");
            }else{
            System.out.println("Maaf, Anda belum layak");
        }
        
    }
}
