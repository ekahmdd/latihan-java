package algorithmpemrograman;
import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        
        System.out.println("Masukkan Panjang");
        int panjang = nilai.nextInt();
        
        System.out.println("Masukkan Lebar");
        int lebar = nilai.nextInt();
        
        int Luas = panjang * lebar;
        
        System.out.println("Luas persegi panjang adalah: " + Luas);
        
    }
}
