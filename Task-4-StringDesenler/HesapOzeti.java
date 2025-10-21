import java.util.ArrayList;
import java.util.List;

/**
 * Ürün bilgilerini (isim, miktar, birim fiyat) tutmak için
 * basit bir sınıf (class).
 */
class Urun {
    String isim;
    double miktar;
    double birimFiyat; // Ürünün bir adet/kg fiyatı

    // Yapıcı Metot (Constructor)
    public Urun(String isim, double miktar, double birimFiyat) {
        this.isim = isim;
        this.miktar = miktar;
        this.birimFiyat = birimFiyat;
    }

    // Toplam fiyatı hesaplayan bir metot
    public double getToplamFiyat() {
        return this.miktar * this.birimFiyat;
    }
}


/**
 * Alışveriş listesini oluşturan ve tablo olarak yazdıran ana sınıf.
 */
public class AlisverisListesi {

    public static void main(String[] args) {
        
        // Ürünlerimizi tutmak için bir liste oluşturalım
        List<Urun> liste = new ArrayList<>();

        // Listeye örnek ürünler ekleyelim
        // (Ürün Adı, Miktar, Birim Fiyat)
        liste.add(new Urun("Elma (kg)", 1.5, 15.50));
        liste.add(new Urun("Süt (1L)", 2.0, 28.75));
        liste.add(new Urun("Ekmek (adet)", 3.0, 8.00));
        liste.add(new Urun("Yumurta (15'li)", 1.0, 75.00));
        liste.add(new Urun("Kıyma (kg)", 0.5, 480.00));

        // --- Tabloyu Yazdırma ---

        // 1. Başlıkları Yazdır
        // %-20s : Sola dayalı 20 karakterlik String (Ürün Adı)
        // %10s : Sağa dayalı 10 karakterlik String (Miktar)
        // %15s : Sağa dayalı 15 karakterlik String (Birim Fiyat)
        // %15s : Sağa dayalı 15 karakterlik String (Toplam Fiyat)
        // %n     : Yeni satır
        System.out.printf("%-20s %10s %15s %15s%n", 
                          "ÜRÜN ADI", "MİKTAR", "BİRİM FİYAT", "TOPLAM FİYAT");
        
        // 2. Ayırıcı Çizgi
        System.out.println("------------------------------------------------------------------");

        double genelToplam = 0.0;

        // 3. Liste boyunca dön ve her ürünü formatlı yazdır
        for (Urun urun : liste) {
            double toplamFiyat = urun.getToplamFiyat();
            genelToplam += toplamFiyat;

            // Format:
            // %-20s  : Ürün ismi (Sola dayalı String)
            // %10.2f : Miktar (Sağa dayalı, 2 ondalıklı sayı)
            // %15.2f : Birim Fiyat (Sağa dayalı, 2 ondalıklı sayı)
            // %15.2f : Toplam Fiyat (Sağa dayalı, 2 ondalıklı sayı)
            System.out.printf("%-20s %10.2f %14.2f TL %14.2f TL%n", 
                              urun.isim, 
                              urun.miktar, 
                              urun.birimFiyat, 
                              toplamFiyat);
        }

        // 4. Ayırıcı Çizgi
        System.out.println("------------------------------------------------------------------");

        // 5. Genel Toplamı Yazdır
        // Toplam yazısını sağa dayalı yazdırmak için ilk 47 karakteri boş bırakıyoruz
        System.out.printf("%-47s %14.2f TL%n", "GENEL TOPLAM:", genelToplam);
    }
}
