public class CarpimTablosu {

    public static void main(String[] args) {
        
        // Çarpım tablosunu oluşturacağımız sayı
        int sayi = 2;

        System.out.println(sayi + "'nin Çarpım Tablosu");
        System.out.println("-----------------------");

        // 1'den 10'a kadar (10 dahil) giden bir döngü
        for (int i = 1; i <= 10; i++) {
            
            // 2 ile o anki 'i' değerini çarp
            int sonuc = sayi * i;
            
            // Sonucu formatlı bir şekilde ekrana yazdır
            // Örnek: 2 x 1 = 2
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
    }
}
