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
public class Soalan_3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan satu nombor bulat: ");
        int nombor = input.nextInt();
        
        if (nombor % 2 == 0){
            System.out.println(nombor + " adalah nombor genap.");
            
            }else{
            System.out.println(nombor +" adalah nombor ganjil.");
        }
    }
}
