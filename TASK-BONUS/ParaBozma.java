public class parabozma
{

    /**
     * Verilen para miktarını TL banknotlarına ayırır.
     * @param tutar Ayrıştırılacak toplam para miktarı (int).
     */
    public static void banknotlariHesapla(int tutar) {
        // TL banknotları (en büyükten en küçüğe)
        int[] banknotlar = {200, 100, 50, 20, 10, 5};
        
        System.out.println(tutar + " TL için banknot dökümü:");

        // Kalan tutarı takip etmek için bir kopya oluşturalım
        int kalanTutar = tutar;

        // Tüm banknot dizisini döngüye al
        for (int banknot : banknotlar) {
            // 1. Bu banknottan kaç adet sığdığını bul (tamsayı bölmesi)
            int adet = kalanTutar / banknot;

            // 2. Eğer o banknottan en az 1 adet kullanılıyorsa
            if (adet > 0) {
                // Sonucu yazdır
                System.out.println(adet + " adet " + banknot + " TL");
                
                // 3. Kullanılan miktarı toplamdan düş (kalanı bul)
                kalanTutar = kalanTutar % banknot; // veya kalanTutar -= adet * banknot;
            }
        }

        // Banknotlara bölünemeyen (bozuk para) bir kısım kaldıysa
        if (kalanTutar > 0) {
            System.out.println("Kalan bozuk para: " + kalanTutar + " TL");
        }
    }

    public static void main(String[] args) {
        // 1. Kullanıcının istediği 1000 TL'yi hesapla
        banknotlariHesapla(1000);

        System.out.println("\n--- Başka Bir Örnek ---");
        
        // 2. Daha karmaşık bir örnek (örn: 1885 TL)
        banknotlariHesapla(1885);
    }
}
