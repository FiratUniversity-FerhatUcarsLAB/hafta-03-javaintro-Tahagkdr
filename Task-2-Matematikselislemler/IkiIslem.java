public class Ikıİşlem {
    public static void main(String[] args) {

        // 1. Adım: Pay'ı hesaplayalım.
        // İşlem: (9.5 × 4.5) - (2.5 × 3)
        // Java'da çarpma için '*', çıkarma için '-' kullanılır.
        // İşlem önceliği (parantezler ve çarpma) Java'da da geçerlidir.

        double pay = (9.5 * 4.5) - (2.5 * 3.0);

        // 2. Adım: Payda'yı hesaplayalım.
        // İşlem: 10.5 - 3.5

        double payda = 10.5 - 3.5;

        // 3. Adım: Sonucu (Pay / Payda) hesaplayalım.
        

        double sonuc = pay / payda;

        // 4. Adım: Tüm aşamaları ve sonucu ekrana yazdıralım.
      

        System.out.printf("Hesaplanan Pay  : %.2f\n", pay);   // Çıktı: 35.25
        System.out.printf("Hesaplanan Payda: %.1f\n", payda);  // Çıktı: 7.0
        System.out.println("-------------------------");
        System.out.println("Sonuç (Pay / Payda): " + sonuc); // Çıktı: 5.035714...

     
    }
}
