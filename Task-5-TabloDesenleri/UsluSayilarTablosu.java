public class SayiKuvvetleri {

    public static void main(String[] args) {
        
        // Tablo başlıklarını yazdıralım
        // \t karakteri sekmeler (tab) ekleyerek hizalamayı sağlar
        System.out.println("a\t a^2\t a^3");
        System.out.println("--------------------");

        // 1'den 5'e kadar (5 dahil) giden bir for döngüsü
        for (int a = 1; a <= 5; a++) {
            
            // Kare (a * a) ve küp (a * a * a) hesaplamaları
            int kare = a * a;
            int kup = a * a * a;
            
            // Alternatif olarak Math.pow kullanarak (ancak int'e çevirmek gerekir):
            // double kare = Math.pow(a, 2);
            // double kup = Math.pow(a, 3);

            // Sonuçları aynı satırda, aralarında sekme bırakarak yazdır
            System.out.println(a + "\t " + kare + "\t " + kup);
        }
    }
}
