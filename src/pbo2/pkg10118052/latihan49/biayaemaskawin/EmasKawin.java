/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan49.biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis object untuk menghitung emas 
 * kawin pergram nya dengan perhitungan sederhana
 */
public class EmasKawin {
    private double berat, hargaPerGram;

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHargaPerGram(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }
    
    public double hitungTotalHarga() {
        return berat * hargaPerGram;
    }
}
