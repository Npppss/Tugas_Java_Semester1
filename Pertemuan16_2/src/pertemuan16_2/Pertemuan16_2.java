/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan16_2;

/**
 *
 * @author Novandra
 */
class OperasiAritmatika {
    protected double bilanganA;
    protected double bilanganB;

    public OperasiAritmatika(double bilanganA, double bilanganB) {
        this.bilanganA = bilanganA;
        this.bilanganB = bilanganB;
    }

    public double penjumlahan() {
        return bilanganA + bilanganB;
    }

    public double pengurangan() {
        return bilanganA - bilanganB;
    }

    public double perkalian() {
        return bilanganA * bilanganB;
    }

    public double pembagian() {
        if (bilanganB != 0) {
            return bilanganA / bilanganB;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak valid.");
            return Double.NaN; // Not-a-Number
        }
    }
}

public class Pertemuan16_2 {
    public static void main(String[] args) {
        double bilanganA = 9.5;
        double bilanganB = 2.5;

        OperasiAritmatika kalkulator = new OperasiAritmatika(bilanganA, bilanganB);

        System.out.println("Hasil Penjumlahan: " + kalkulator.penjumlahan());
        System.out.println("Hasil Pengurangan: " + kalkulator.pengurangan());
        System.out.println("Hasil Perkalian: " + kalkulator.perkalian());
        System.out.println("Hasil Pembagian: " + kalkulator.pembagian());
    }
}

