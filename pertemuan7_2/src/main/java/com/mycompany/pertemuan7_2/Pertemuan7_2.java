/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7_2;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pertemuan7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN: ");
        int tahun = scanner.nextInt();

        System.out.print("PILIH PEMINATAN (M/I): ");
        char peminatan = scanner.next().charAt(0);

        // Menggunakan nested switch untuk menentukan peminatan
        switch (tahun) {
            case 1:
                System.out.println("Anda belum memilih peminatan.");
                break;
            case 2:
                switch (peminatan) {
                    case 'M':
                        System.out.println("PEMROGRAMAN MOBILE");
                        break;
                    case 'I':
                        System.out.println("PEMROGRAMAN JAVA 2");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                }
                break;
            case 3:
                switch (peminatan) {
                    case 'M':
                        System.out.println("PEMROGRAMAN WEB");
                        break;
                    case 'I':
                        System.out.println("PEMROGRAMAN DATABASE");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                }
                break;
            default:
                System.out.println("Tahun tidak valid.");
        }
    }
}
