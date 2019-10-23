/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan49.biayaemaskawin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis object untuk menghitung emas 
 * kawin pergram nya dengan perhitungan sederhana
 */
public class PBO210118052Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        EmasKawin emasKawin = new EmasKawin();
        
        System.out.println("====Program Hitung Emas Kawin====");
        System.out.print("Masukkan harga emas pergram = Rp. ");
        emasKawin.setHargaPerGram(scanner.nextDouble());
        System.out.print("Masukkan berat (gram) = ");
        emasKawin.setBerat(scanner.nextDouble());
        
        System.out.println("Total yang harus dibayar = Rp. "
                + emasKawin.hitungTotalHarga());
    }
    
}
