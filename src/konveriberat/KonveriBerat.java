/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konveriberat;

/**
 *
 * @author M . FR
 */
import java.util.Scanner;
public class KonveriBerat {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan massa dalam Kilogram : ");
        Scanner input = new Scanner(System.in);
        double kg = input.nextDouble();
        double g = kg * 1000;
        double mg = g * 1000;
        
        System.out.println("\tHasil Konversi Massa");
        System.out.println("Kilogram ke Gram \t : " +g);
        System.out.println("Kilogram ke Miligram \t : " +mg);
    }
    
}
