import java.lang.Math; // Math.sqrt() fonksiyonu için

public class UcgenAlanHesaplama {

    public static void main(String[] args) {
        
        // Kenar uzunlukları
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // 1. Yarı Çevreyi (u) hesapla
        double u = (a + b + c) / 2.0;

        // 2. Heron formülünü kullanarak alanı hesapla
        // Alan = Kök(u * (u-a) * (u-b) * (u-c))
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Sonuçları yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Üçgenin Yarı Çevresi (u): " + u);
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
