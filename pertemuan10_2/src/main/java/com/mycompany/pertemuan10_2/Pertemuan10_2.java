/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10_2;

/**
 *
 * @author Novandra
 */
public class Pertemuan10_2 {
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
            throw new ArithmeticException("Pembagian dengan nol tidak valid.");
        }
    }

    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        // Membuat objek Aritmatika1
        Pertemuan10_2 aritmatikaObjek = new Pertemuan10_2();

        // Nilai bilangan1 dan bilangan2
        int bilangan1 = 10;
        int bilangan2 = 3;

        // Mengakses metode pengurangan
        int hasilPengurangan = aritmatikaObjek.kurang(bilangan1, bilangan2);
        System.out.println("Hasil pengurangan: " + hasilPengurangan);

        // Mengakses metode perkalian
        int hasilPerkalian = aritmatikaObjek.kali(bilangan1, bilangan2);
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        // Mengakses metode pembagian
        double hasilPembagian = aritmatikaObjek.bagi(bilangan1, bilangan2);
        System.out.println("Hasil pembagian: " + hasilPembagian);

        // Mengakses metode pangkat
        double hasilPangkat = aritmatikaObjek.pangkat(bilangan1, bilangan2);
        System.out.println("Hasil pangkat: " + hasilPangkat);
    }
}
