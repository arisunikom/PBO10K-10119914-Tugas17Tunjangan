/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas17;
import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF 10K
 */
public class Main {
    public static void main(String[] args) {
        float GajiPokok;
        float Tunjangan;
        float TotalGaji;
        String Status;
        
        // Making input
        var keyboard = new Scanner(System.in);
        
        System.out.println("==============Program Tunjangan=======");
        System.out.println("Berapa Gaji Pokok Anda Sebulan? : ");
        GajiPokok = keyboard.nextFloat();
        System.out.println("Status Anda? (Menikah/Belum) : ");
        Status = keyboard.next();
        
        if(Status.equals("Menikah")){
            Tunjangan = 0.35f*GajiPokok;
        }else{
            Tunjangan = 0;
        }
        
        TotalGaji = GajiPokok+Tunjangan;
        
        System.out.println("\n==============Hasil Perhitungan Gaji Anda==============");
        System.out.println("Status Anda \t : " + Status);
        System.out.println("Gaji Pokok \t : " + GajiPokok);
        System.out.println("Tunjangan \t : " + Tunjangan);
        System.out.println("Total Gaji \t : " + TotalGaji);
    }
}
