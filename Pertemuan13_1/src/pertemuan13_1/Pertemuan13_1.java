/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan13_1;

/**
 *
 * @author Novandra
 */
class Kalkulator {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak valid.");
            return Double.NaN; // Not-a-Number
        }
    }
}

public class Pertemuan13_1 {

    public static void main(String[] args) {
       Kalkulator kalkulator = new Kalkulator();

        int angka1 = 40;
        int angka2 = 20;

        int hasilTambah = kalkulator.tambah(angka1, angka2);
        int hasilKurang = kalkulator.kurang(angka1, angka2);
        int hasilKali = kalkulator.kali(angka1, angka2);
        double hasilBagi = kalkulator.bagi(angka1, angka2);

        System.out.println("Hasil Pertambahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
    
}
