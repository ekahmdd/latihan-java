package algorithmpemrograman;
import java.util.Scanner;

public class programInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, alamat;
        int umur;
        
        System.out.print("Masukkan nama anda \t: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan alamat anda \t: ");
        alamat = input.nextLine();
        
        System.out.print("Masukkan umur anda \t: ");
        umur = input.nextInt();
        
        System.out.println("======================");
        System.out.println(nama+" Lahir di "+alamat);
        System.out.println("Berumur "+umur+" th.");
    }
    
}
