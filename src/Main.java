import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int turkce,matematik,fen,sosyal,beden;
        double ortalama;

        System.out.print("Turkce Notunuzu Giriniz :");
        turkce = input.nextInt();
        System.out.print("Matematik Notunuzu Giriniz :");
        matematik = input.nextInt();
        System.out.print("Fen Bilgisi Notunuzu Giriniz :");
        fen = input.nextInt();
        System.out.print("Sosyal Bilgiler Notunuzu Giriniz :");
        sosyal = input.nextInt();
        System.out.print("Beden Egitimi Notunuzu Giriniz :");
        beden = input.nextInt();

        ortalama = (turkce + matematik + fen + sosyal + beden) / 5;
        System.out.println("Not Ortalamasi :" + ortalama);

        if (ortalama>=50) {
            System.out.println("Sinifi Gectiniz");
        }
        else {
            System.out.println("Sinifta Kaldiniz");
        }

    }
}