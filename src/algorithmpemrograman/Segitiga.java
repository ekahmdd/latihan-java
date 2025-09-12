package algorithmpemrograman;
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        
        System.out.println("Masukkan alas");
        int alas = nilai.nextInt();
        
        System.out.println("Masukkan tinggi");
        int tinggi = nilai.nextInt();
        
        float Luas =(float) 1 / 2 * alas * tinggi;
        
        System.out.println("Luas segitiga adalah: " + Luas);
        
    }
    
}
