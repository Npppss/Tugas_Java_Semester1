/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8_2;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan8_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal tahun
        System.out.print("Tahun Awal: ");
        int tahunAwal = scanner.nextInt();

        // Meminta input nilai akhir tahun
        System.out.print("Tahun Akhir: ");
        int tahunAkhir = scanner.nextInt();

        // Menampilkan bilangan tahun dari nilai awal hingga nilai akhir
        System.out.println("Hasil:");
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }
}
