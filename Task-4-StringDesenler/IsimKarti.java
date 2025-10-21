public class OgrenciBilgiKarti {

    public static void main(String[] args) {
        
        // 1. Bilgileri değişkenlere atayalım
        String ad = "Muhammed Taha";
        String soyad = "Gökdere";
        
        // ÖNEMLİ: Öğrenci No'yu buraya girebilirsin
        String ogrenciNo = "250541092; 
        
        String bolum = "Yazılım";

        // 2. Güzel bir formatta yazdırma
        
        String cizgi = "=============================================";
        String bosluk = "|                                           |";
        
        System.out.println("\n" + cizgi);
        System.out.printf("|          ÖĞRENCİ BİLGİ KARTI            |%n");
        System.out.println(cizgi);
        System.out.println(bosluk);
        
        // %-15s : 15 karakterlik alanı kapla, metni sola daya
        // %-25s : 25 karakterlik alanı kapla, metni sola daya
        // %n      : Yeni satıra geç
        
        System.out.printf("| %-15s: %-25s |%n", "Ad", ad);
        System.out.printf("| %-15s: %-25s |%n", "Soyad", soyad);
        System.out.println(bosluk); // Ayırıcı boşluk
        System.out.printf("| %-15s: %-25s |%n", "Öğrenci No", ogrenciNo);
        System.out.printf("| %-15s: %-25s |%n", "Bölüm", bolum);
        System.out.println(bosluk);
        System.out.println(cizgi + "\n");
    }
}
