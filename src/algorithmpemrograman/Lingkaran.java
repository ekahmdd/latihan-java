package algorithmpemrograman;
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
    double r;
    final double pi = 3.14;

    System.out.print("Masukkan Jari-Jari: ");
    Scanner input = new Scanner(System.in);
    
    r = input.nextDouble();
    
    double L = pi * (r * r);
    double K = 2 * pi * r;
    
    System.out.println("Luas Lingkaran adalah: " + L);
    System.out.println("Luas Lingkaran adalah: " + K);
    
   
    }
}
