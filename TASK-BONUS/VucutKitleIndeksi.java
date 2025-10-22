
public class VucutKitleEndeksi {

    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--- Vücut Kitle Endeksi (VKE) Hesaplayıcı ---");

        // 1. Kilo bilgisi al
        System.out.print("Lütfen kilonuzu (kg) giriniz (örn: 75.5): ");
        double kilo = scanner.nextDouble();

        // 2. Boy bilgisi al (Genellikle cm olarak almak daha az hata yaptırır)
        System.out.print("Lütfen boyunuzu (cm) giriniz (örn: 175): ");
        double boyCm = scanner.nextDouble();

        // 3. Boyu cm'den metreye çevir
        double boyMetre = boyCm / 100.0;

       
        if (boyMetre > 0) {
            double vke = kilo / (boyMetre * boyMetre);

            // Sonucu formatlayarak (%.2f -> virgülden sonra 2 basamak) yazdır
            System.out.println("------------------------------------");
            System.out.printf("Vücut Kitle Endeksiniz (VKE): %.2f%n", vke);
            
            // 5. Durumu Yorumla
            yorumlaVKE(vke);

        } else {
            System.out.println("Geçersiz boy bilgisi girdiniz.");
        }

        scanner.close(); // Kaynakları serbest bırak
    }

  
     */
    public static void yorumlaVKE(double vke) {
        String durum;

        if (vke < 18.5) {
            durum = "Zayıf (Underweight)";
        } else if (vke >= 18.5 && vke < 25) {
            durum = "Normal Kilolu (Normal weight)";
        } else if (vke >= 25 && vke < 30) {
            durum = "Fazla Kilolu (Overweight)";
        } else if (vke >= 30 && vke < 40) {
            durum = "Obez (Obese)";
        } else { // vke >= 40
            durum = "İleri Düzeyde Obez (Morbidly Obese)";
        }

        System.out.println("Durumunuz: " + durum);
    }
}
