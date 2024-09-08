/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan18_1;

/**
 *
 * @author Novandra
 */
public class throw_1 {
    public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // Throws an exception if age is less than 18
            System.out.println("Valid age!");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
    }
}

}

/**
* Anda dapat menggunakan throw untuk secara manual melempar exception dari suatu metode.
* Biasanya digunakan ketika kondisi tertentu memerlukan penanganan khusus.
*/