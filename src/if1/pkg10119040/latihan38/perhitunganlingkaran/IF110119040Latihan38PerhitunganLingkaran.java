/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program menghitung lingkaran dengan konsep 
 * pendekatan berbasis objek
 */
public class IF110119040Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setDiameter(inputDiameter());
        lingkaran.hitungLingkaran();
    }

    public static int inputDiameter() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
        boolean looped = false;
        
        do {
            if(looped) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                scanner.nextLine();
           }
            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            
            looped = true;
        } while(!scanner.hasNextInt());
        
        return scanner.nextInt();
    }
    
}
