package algorithmpemrograman;
import java.util.Scanner;

public class MenukarIsiGelas {
    public static void main(String[] args) {
       Scanner objek = new Scanner (System.in);
       
       
       System.out.println("Masukkan Isi Gelas A: ");
       String GelasA = objek.nextLine();
       
       System.out.println("Msukkan Isi Gelas B: ");
       String GelasB = objek.nextLine();
       
       String GelasS = GelasA;
       GelasA = GelasB;
       GelasB = GelasS;
       
       
       
       System.out.println("Isi gelas setelah ditukar :");
       System.out.println("Gelas A: " + GelasA);
       System.out.println("Gelas B: " + GelasB);
    }
    
}
