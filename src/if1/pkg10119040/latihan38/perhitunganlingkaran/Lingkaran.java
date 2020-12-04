/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan38.perhitunganlingkaran;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program menghitung lingkaran dengan konsep 
 * pendekatan berbasis objek
 */
public class Lingkaran {
    public int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    public int jariJari() {
        return diameter / 2;
    }
    
    public double luas() {
        return Math.PI * Math.pow(jariJari(), 2);
    }
    
    public double keliling() {
        return 2 * Math.PI * jariJari();
    }
    
    public String formatNilai(double nilai) {
        return String.format("%.2f", nilai).replace('.', ',');
    } 
    
    public void hitungLingkaran() {
        System.out.println("\n====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = " +
                jariJari() + " cm");
        System.out.println("Luas Lingkaran = " +
                formatNilai(luas()) + " cm");
        System.out.println("Keliling Lingkaran = " +
                formatNilai(keliling()) + " cm");
    }
}
