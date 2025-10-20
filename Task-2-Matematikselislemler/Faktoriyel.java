import java.util.Scanner;

public class faktöryel {
    public static void main(String[] args) {
        int sayi = 6;
        Scanner input = new Scanner(System.in);
        long faktoriyelSonucu = 1   ;
        for (int i = 1; i <= sayi; i++) {
            System.out.println(sayi + "! (faktöriyel) = " + faktoriyelSonucu);
        }

    }
}

