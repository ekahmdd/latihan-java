package algorithmpemrograman;

public class MenukarIsiGelas2 {
    public static void main(String[] args) {
        String GelasA = "Kopi";
        String GelasB = "Teh";
        String GelasS = GelasA;
        GelasA = GelasB;
        GelasB = GelasS;
        
        System.out.println("Gelas A: " + GelasA);
        System.out.println("Gelas B: " + GelasB);
        
    }
}
