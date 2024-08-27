/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pettemuan17_1;
import java.util.Scanner;
/**
 *
 * @author Novandra
 */
public class Pettemuan17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); // Consuming newline

        String[] kota = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine();
        }

        System.out.println("Kota-kota yang dimasukkan:");
        for (String namaKota : kota) {
            System.out.println(namaKota);
        }

        scanner.close();
    }
    
}
