/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10_1;

/**
 *
 * @author Novandra
 */
public class Pertemuan10_1 {
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Metode pembagian
    public double pembagian(int a, int b) {
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
        Pertemuan10_1 aritmatika = new Pertemuan10_1();
         System.out.println("Hasil penjumlahan: " + aritmatika.tambah(5, 3));
        System.out.println("Hasil pengurangan: " + aritmatika.pengurangan(5, 3));
        System.out.println("Hasil perkalian: " + aritmatika.perkalian(5, 3));
        System.out.println("Hasil pembagian: " + aritmatika.pembagian(5, 3));
        System.out.println("Hasil pangkat: " + aritmatika.pangkat(5, 3));
    }
}
