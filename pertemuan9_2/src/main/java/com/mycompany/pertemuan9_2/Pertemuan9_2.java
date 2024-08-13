/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9_2;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan9_2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal
        System.out.print("Masukkan bilangan awal: ");
        int nilaiAwal = scanner.nextInt();

        // Meminta input nilai akhir
        System.out.print("Masukkan bilangan akhir: ");
        int nilaiAkhir = scanner.nextInt();

        // Menampilkan deret bilangan dengan pertambahan 5
        System.out.print("Hasil deret bilangan: ");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i);
            if (i + 5 <= nilaiAkhir) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
