/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan16_1;

/**
 *
 * @author Novandra
 */
abstract class OperasiAritmatika {
    protected double bilanganA;
    protected double bilanganB;

    public OperasiAritmatika(double bilanganA, double bilanganB) {
        this.bilanganA = bilanganA;
        this.bilanganB = bilanganB;
    }

    // Method abstract untuk operasi penjumlahan
    public abstract double penjumlahan();

    // Method abstract untuk operasi pengurangan
    public abstract double pengurangan();

    // Method abstract untuk operasi perkalian
    public abstract double perkalian();

    // Method abstract untuk operasi pembagian
    public abstract double pembagian();
}

class Kalkulator extends OperasiAritmatika {
    public Kalkulator(double bilanganA, double bilanganB) {
        super(bilanganA, bilanganB);
    }

    @Override
    public double penjumlahan() {
        return bilanganA + bilanganB;
    }

    @Override
    public double pengurangan() {
        return bilanganA - bilanganB;
    }

    @Override
    public double perkalian() {
        return bilanganA * bilanganB;
    }

    @Override
    public double pembagian() {
        if (bilanganB != 0) {
            return bilanganA / bilanganB;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak valid.");
            return Double.NaN; // Not-a-Number
        }
    }
}

public class Pertemuan16_1 {
    public static void main(String[] args) {
        double bilanganA = 9.5;
        double bilanganB = 2.5;

        Kalkulator kalkulator = new Kalkulator(bilanganA, bilanganB);

        System.out.println("Hasil Penjumlahan: " + kalkulator.penjumlahan());
        System.out.println("Hasil Pengurangan: " + kalkulator.pengurangan());
        System.out.println("Hasil Perkalian: " + kalkulator.perkalian());
        System.out.println("Hasil Pembagian: " + kalkulator.pembagian());
    }
}
