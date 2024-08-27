/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan14_2;

/**
 *
 * @author Novandra
 */
abstract class AbstrakHewan {
    // Method abstract (tidak memiliki implementasi di sini)
    public abstract void suara();
}

// Child class Burung yang meng-extend AbstrakHewan
class Burung extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
}
public class Pertemuan14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Burung
        Burung burung = new Burung();

        // Memanggil method suara() dari objek burung
        burung.suara();
    }
    
}
