package en_bastan;

import java.util.Scanner;

public class En_bastan {

    public static void main(String[] args) {
    
     Scanner s = new Scanner(System.in);
     
     System.out.println("Bir Sayi giriniz:");
     
    int x;
    
    x = s.nextInt();
    
    for (int i = x-1; i<x && i>0; i--){
    x *= i;
    
    }
    
    System.out.println("Girdiginiz Sayi: "+x);
    System.out.println("Faktoriyeli: "+x);
    
     }  
     
     }
