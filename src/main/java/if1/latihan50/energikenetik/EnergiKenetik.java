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
 * Deskripsi Program : Program ini berisi class EnergiKenetik
 * 
 */

public class EnergiKenetik {
    private double massa, kecepatan;   
    
    public EnergiKenetik(double massa, double kecepatan) {
        this.massa = massa / 1000;
        this.kecepatan = kecepatan;
    }
    
    public double getMassa() {
        return massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
}