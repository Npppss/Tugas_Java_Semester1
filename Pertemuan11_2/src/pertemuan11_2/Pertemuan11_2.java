/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan11_2;
import java.util.Scanner;

/**
 *
 * @author Novandra
 */
class Karyawan {
    private int idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;
public Karyawan(int idKaryawan, String namaKaryawan, String golongan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        setJabatanGaji();
    }
  private void setJabatanGaji() {
        switch (golongan) {
            case "1":
                jabatan = "Assisten Staff";
                gajiPokok = 3000000.0;
                break;
            case "2":
                jabatan = "Staff";
                gajiPokok = 3500000.0;
                break;
            case "3":
                jabatan = "Supervisor";
                gajiPokok = 4000000.0;
                break;
            case "4":
                jabatan = "Assisten Manager";
                gajiPokok = 5000000.0;
                break;
            case "5":
                jabatan = "Manager";
                gajiPokok = 6000000.0;
                break;
            default:
                jabatan = "Tidak valid";
                gajiPokok = 0.0;
        }
    }
  public void tampilkanInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
public class Pertemuan11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID Karyawan: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consuming newline

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Golongan (1-5): ");
        String gol = scanner.nextLine();

        Karyawan karyawan = new Karyawan(id, nama, gol);
        System.out.println("\nInformasi Karyawan:");
        karyawan.tampilkanInfo();

        scanner.close();
    }
}

