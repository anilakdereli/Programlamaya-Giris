package en_bastan;

import java.util.Scanner;

public class En_bastan {

   
    
    public static void main(String[] args) {
        // TODO code application logic here 
       Scanner sayi = new Scanner (System.in);
       System.out.println("Toplamak istediginiz 1. sayiyi giriniz lutfen:");
       float x; 
       x = sayi.nextFloat();
       System.out.println("Toplamak istediginiz 2. sayiyi giriniz lutfen:");
       float y; 
        y = sayi.nextFloat();
      System.out.println("Girdiginiz Sayilarin Toplami:"+(x+y) );
      System.out.println("Girdiginiz Sayilarin Carpimi:"+(x*y));
      System.out.println("Girdiginiz Sayilarin Bolumu:"+(x/y));
      System.out.println("Girdiginiz Sayilarin Kalani:"+(x%y));
      System.out.println("Girdiginiz Sayilarin Farki"+(x-y));
    }
}
