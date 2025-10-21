import java.util.Scanner;

public class dairehesap {
    public static void main(String[] args) {
        double r = 4.5;
        double pi = 3.14159;
                //Alan hesapla;
        double alan = pi*r*r;
        //çevre hesaplama
        double cevre = 2 * pi * r ;
        System.out.println("Yaricap:"+ r);
        System.out.println("Alan:"+ alan);
        System.out.println("Cevre:"+ cevre);
    }
}
