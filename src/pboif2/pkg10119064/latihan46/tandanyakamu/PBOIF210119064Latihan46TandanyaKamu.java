/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;
import model.Age;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menentukan umur dan 
 * menampilkan sifat seseorang
 */
public class PBOIF210119064Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek Age
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        //input
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(keyboard.nextInt());
        
        //output
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
