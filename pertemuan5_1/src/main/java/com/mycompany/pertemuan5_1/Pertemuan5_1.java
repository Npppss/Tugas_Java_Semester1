/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5_1;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan5_1 {

    public static void main(String[] args) {
        // Deklarasi variabel
        String nama, alamat;
        int usia, gaji;

        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan judul
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");

        // Meminta input nama karyawan
        System.out.print("Nama karyawan: ");
        nama = keyboard.nextLine();

        // Meminta input alamat karyawan
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();

        // Meminta input usia karyawan
        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        // Meminta input gaji karyawan
        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();

        // Menampilkan data yang sudah diinput
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
    }
}
