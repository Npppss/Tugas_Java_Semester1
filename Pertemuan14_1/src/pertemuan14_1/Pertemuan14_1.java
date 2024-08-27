/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan14_1;

/**
 *
 * @author Novandra
 */
abstract class AbstrakHewan {
    // Method abstract (tidak memiliki implementasi di sini)
    public abstract void suara();

    // Method konkrit (memiliki implementasi)
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

// Contoh kelas turunan (child class) yang meng-extend AbstrakHewan
class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Meong-meong!");
    }
}

class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Guk-guk!");
    }
}

public class Pertemuan14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        // Memanggil method suara() dari objek kucing dan anjing
        kucing.suara();
        anjing.suara();

        // Memanggil method suara2() dari objek kucing dan anjing
        kucing.suara2();
        anjing.suara2();
    }
    
}
