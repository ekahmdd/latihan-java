package algorithmpemrograman;
import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        double panjang;
        double lebar;
        double luas;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
          panjang = input.nextDouble();
          System.out.print("Masukkan Lebar: ");
          lebar = input.nextDouble();
          
          luas = panjang*lebar;
          
          System.out.println("Luas Persegi Panjang adalah: " + luas);
          
          
    }
}
