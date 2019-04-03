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
class KG{
    public void KG(double kg){
    double x = kg*1;
        System.out.println("Hasil konversi ke Kilogram  = "+x);
    }
}
class G{
    public void G(double kg){
        double x = kg*1000;
        System.out.println("Hasil Konversi ke Gram = " +x);
    }
}
class MG{
    public void MG(double kg){
        
        double x = kg * 1000000;
        System.out.println("Hasil Konversi ke Miligram = " +x);
    }
}
class main
{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      System.out.println("Masukkan Massa dalam kilogram : ");
      double kg = input.nextDouble();
      KG kilo = new KG();
      G gra = new G();
      MG mili = new MG();
      
      kilo.KG(kg);
      gra.G(kg);
      mili.MG(kg);
  }  
}