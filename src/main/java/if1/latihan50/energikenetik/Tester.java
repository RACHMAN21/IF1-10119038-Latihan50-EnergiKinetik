/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan50.energikenetik;

/**
 *
 * @author 
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi menghitung energi kinetik dengan 
 *                     pendekatan object oriented
 * 
 */

public class Tester {
    public static void main(String[] args) {
        EnergiKenetik objEK = new EnergiKenetik(145, 25);
        System.out.println("===Menghitung Energi Kinetik===");
        System.out.printf("Massa : %.3f Kg\n", objEK.getMassa());
        System.out.printf("Kecepatan : %.0f m/s\n", objEK.getKecepatan() );
        System.out.printf("Energi Kinetik : %.4f J\n", objEK.hitungEnergiKinetik());
        System.out.printf("Usaha : %.4f J\n", objEK.hitungUsaha(0));
    }
}