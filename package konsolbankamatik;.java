package konsolbankamatik;

import java.util.Scanner;
import java.math.*;

public class konsolbankamatik {

    public static void main(String[] args) {
        int bakiye = 50;
        Scanner s = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Bankamatiğe Hosgeldiniz");
        System.out.println("--------------");

        inner: while (true) {
            System.out.println("--------------");
            System.out.println("İslem Türünü Seçin");
            System.out.println("1 Para Yatırma");
            System.out.println("2 Para Çekme  ");
            System.out.println("3 Bakiye Sorma");
            System.out.println("4 Çıkış");
            System.out.println("--------------");
            Scanner g = new Scanner(System.in);
            int islem = g.nextInt();
            switch (islem) {
                case 1: {
                    Scanner p = new Scanner(System.in);
                    System.out.println("--------------");
                    System.out.println("Yatıralacak Tutarı Giriniz");
                    Double q = p.nextDouble();
                    bakiye = (int) (bakiye + q);
                    System.out.println("Paranız Hesabınıza Yatırıldı.");
                    System.out.println("Bakiyeniz: " + bakiye);
                    System.out.println("Başka işlem yapmak için C ' ye basın.");
                    System.out.println("Çıkış yapmak için Q ' ya basın");
                    System.out.print("İsleminiz: ");
                    System.out.println("--------------");
                    Scanner i = new Scanner(System.in);
                    String sa = i.nextLine();
                    switch (sa) {
                        case "Q": {
                            break;
                        }
                        case "C": {
                            continue inner;
                        }
                    }
                }
                case 2: {
                    Scanner p = new Scanner(System.in);
                    System.out.println("--------------");
                    System.out.print("Çekilecek Tutarı Girin:");
                    int q = p.nextInt();
                    if (bakiye < q) {
                        System.out.println("Bakiye yetersiz. Tekrar deneyiniz.");
                        continue inner;
                    } else {
                        bakiye = bakiye - q;
                        System.out.println("Para cekme işlemi başarıyla gerçekleşti");
                        System.out.println("Bakiyeniz: " + bakiye);
                        System.out.println("Başka işlem yapmak için C ' ye basın.");
                        System.out.println("Çıkış yapmak için Q ' ya basın");
                        System.out.print("İsleminiz: ");
                        System.out.println("--------------");
                        Scanner i = new Scanner(System.in);
                        String sa = i.nextLine();
                        switch (sa) {
                            case "Q": {
                                break;
                            }
                            case "C": {
                                continue inner;
                            }
                        }
                    }
                }
                case 3: {
                    System.out.println("--------------");
                    System.out.println("Bakiyeniz: " + bakiye);
                    System.out.println("Baska işlem yapmak için C ' ye basın.");
                    System.out.println("Çıkış yapmak icin Q ' ya basın");
                    System.out.print("İşleminiz: ");
                    System.out.println("--------------");
                    Scanner i = new Scanner(System.in);
                    String sa = i.nextLine();
                    switch (sa) {
                        case "Q": {
                            break;
                        }
                        case "C": {
                            continue inner;
                        }
                    }
                }
                case 4: {
                    System.out.println("Çıkış Yapılıyor.");
                    break inner;
                }
            }
        }
    }
}