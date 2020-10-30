/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * Kelas    : IF-10K
 * NIM      : 10119906
 * Deskripsi Program : menampilkan hasil perhitungan gaji (Menikah/Tidak Menikah)
 * 
 */
public class IF10K10119906Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String status;
        double gajiPokok, totalGaji, tunjangan;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        status = scanner.next();
        
        tunjangan= (status.equals("Menikah"))? 0.35 * gajiPokok : 0;
        totalGaji = tunjangan + gajiPokok;
        
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok  : Rp. "+gajiPokok);
        System.out.println("Tunjangan   : Rp. "+tunjangan);
        System.out.println("Total Gaji  : Rp. "+totalGaji);
        System.out.println("\b (Developed by Rizqy Ananda Rusmana)");
        
    }
}
