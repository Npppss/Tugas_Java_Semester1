/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6_2;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan6_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("NILAI: ");
        int nilai = scanner.nextInt();

        // Menentukan grade berdasarkan nilai
        String grade;
        if (nilai >= 95) {
            grade = "A";
        } else if (nilai >= 85) {
            grade = "B";
        } else if (nilai >= 75) {
            grade = "C";
        } else {
            grade = "D";
        }

        // Menentukan keterangan berdasarkan grade
        String keterangan;
        if (nilai >= 75) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }

        // Menampilkan output
        System.out.println("Output:");
        System.out.println("NIM: " + nim);
        System.out.println("NAMA: " + nama);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
