/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8_1;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = scanner.nextInt();

        // Meminta input nilai akhir
        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = scanner.nextInt();

        // Menampilkan bilangan pertambahan 5 dari nilai awal hingga nilai akhir
        System.out.println("Bilangan pertambahan 5:");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i + " ");
        }
    }
}
