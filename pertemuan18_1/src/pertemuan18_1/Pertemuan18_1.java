/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan18_1;

/**
 *
 * @author Novandra
 */
/**
     * Blok try digunakan untuk mengelompokkan kode yang mungkin menghasilkan exception.
    Jika ada
    *exception yang terjadi di dalam blok try, maka blok catch akan menangkapnya dan menjalankan kode yang ada di dalamnya.
    * 
    */
public class Pertemuan18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    
}
