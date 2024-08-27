/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan17_2;

/**
 *
 * @author Novandra
 */
public class Pertemuan17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menampilkan hasil
        for (String[] pair : negaraIbukota) {
            System.out.println("Ibukota " + pair[0] + " adalah " + pair[1]);
        }
    }
    
}
