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
import java.util.Scanner;
public class Soalan_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan markah yang anda perolehi: ");
        double markah = input.nextDouble();
        
        if (markah >= 45){
            System.out.println("Tahniah, anda lulus");
            }else{
            System.out.println("Anda gagal, usaha lagi")
Sharifah husna comel
        }
    }
}
