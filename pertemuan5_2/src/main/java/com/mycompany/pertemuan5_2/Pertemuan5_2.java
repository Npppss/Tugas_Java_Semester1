/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5_2;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan5_2 {

    public static void main(String[] args) {
        // Membuat scanner baru untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        System.out.println("Luas Segitiga: " + luas);
    }
}
