public class  vSaatDonusturm

 
     */
    public static String saniyeyiFormataCevir(int toplamSaniye) {
        // 1 saat = 3600 saniye
        int saat = toplamSaniye / 3600;

       
        // 1 dakika = 60 saniye
        int dakika = (toplamSaniye % 3600) / 60;

        // En son kalan saniyeler
        int saniye = toplamSaniye % 60;

       
        return String.format("%02d:%02d:%02d", saat, dakika, saniye);
    }

    public static void main(String[] args) {
        int saniye1 = 3661; // 1 saat, 1 dakika, 1 saniye
        int saniye2 = 86399; // 23 saat, 59 dakika, 59 saniye
        int saniye3 = 125;   // 0 saat, 2 dakika, 5 saniye
        int saniye4 = 90000; // 25 saat, 0 dakika, 0 saniye

        System.out.println(saniye1 + " saniye = " + saniyeyiFormataCevir(saniye1));
        System.out.println(saniye2 + " saniye = " + saniyeyiFormataCevir(saniye2));
        System.out.println(saniye3 + " saniye = " + saniyeyiFormataCevir(saniye3));
        System.out.println(saniye4 + " saniye = " + saniyeyiFormataCevir(saniye4));
    }
}
