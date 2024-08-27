/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan13_2;

/**
 *
 * @author Novandra
 */
class Segitiga {
    // Metode untuk menghitung luas segitiga dengan parameter alas dan tinggi
    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2.0;
    }

    // Metode overloading: menghitung luas segitiga dengan parameter alas, tinggi, dan luas
    public double hitungLuas(double alas, double tinggi, double luas) {
        // Jika luas yang diberikan sesuai dengan rumus, gunakan nilai luas tersebut
        // Jika tidak, hitung ulang berdasarkan alas dan tinggi
        if (luas == (alas * tinggi) / 2.0) {
            return luas;
        } else {
            System.out.println("Luas yang diberikan tidak sesuai dengan rumus. Menghitung ulang...");
            return (alas * tinggi) / 2.0;
        }
    }
}

public class Pertemuan13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Segitiga segitiga = new Segitiga();

        double alas = 10.0;
        double tinggi = 6.0;
        double luasDariRumus = segitiga.hitungLuas(alas, tinggi);

        System.out.println("Luas segitiga (rumus): " + luasDariRumus);

        // Contoh penggunaan metode overloading dengan memberikan luas yang sesuai
        double luasDiberikan = 30.0;
        double luasHasilOverloading = segitiga.hitungLuas(alas, tinggi, luasDiberikan);
        System.out.println("Luas segitiga (diberikan): " + luasHasilOverloading);
    }
    
}
