import java.util.Locale;

public class MilToKmCevirici {

    public static void main(String[] args) {
        
        // Dönüşüm katsayısı
        final double MIL_TO_KM = 1.609;
        
        // Çevrilecek mil değerlerini bir dizi (array) içinde tanımlayalım
        int[] milDegerleri = {1, 5, 10, 20, 50};
        
        // Hesaplanan kilometre değeri için bir değişken
        double kilometreDegeri;

        // Sayıların ondalık ayıracının nokta (.) olmasını garantilemek için (opsiyonel ama iyi bir pratik)
        Locale.setDefault(Locale.US);

        // --- Tabloyu Yazdırma ---

        // 1. Başlıkları yazdır
        // %-10s : Sola dayalı 10 karakterlik String
        // %-15s : Sola dayalı 15 karakterlik String
        System.out.printf("%-10s %-15s%n", "Mil", "Kilometre");
        System.out.println("-------------------------");

        // 2. Döngü ile dizideki her değeri çevir ve yazdır
        for (int mil : milDegerleri) {
            
            // Hesaplama
            kilometreDegeri = mil * MIL_TO_KM;
            
            // %-10d : Sola dayalı 10 karakterlik tamsayı (int)
            // %-15.3f : Sola dayalı 15 karakterlik, virgülden sonra 3 basamaklı ondalıklı sayı (double/float)
            System.out.printf("%-10d %-15.3f%n", mil, kilometreDegeri);
        }
    }
}
