package tugasbab7;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        String pilih = null;
        String ang;
        do {
            System.out.println("=========Menu========");
            System.out.println("1.Liat harga jasa dan barang salon");
            System.out.println("2.Masukan barang pembelian");
            System.out.println("3.Harga");
            System.out.println("4.Exit");
            System.out.print("masukan pilihan : ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar menu : ");
                    System.out.println("1.Sampo         :Rp.20.000");
                    System.out.println("2.Sabun         :Rp.10.000");
                    System.out.println("3.Bedak         :Rp.40.000");
                    System.out.println("4.Creambath     :Rp.25.000");
                    System.out.println("5.Potong rambut :Rp.35.000");
                    System.out.println("6.Pijet         :Rp.100.000");
                    System.out.println("Premium diskon 20%");
                    System.out.println("Gold diskon 15%");
                    System.out.println("Silver diskon 10%");
                    break;

                case 2:
                    System.out.print("Masukan nama barang/jasa yang ingin dibeli : ");
                    pilih = in.next();
                    break;

                case 3:
                    System.out.print("Masukan Keanggotaan : ");
                    ang = in.next();
                    if (ang.equalsIgnoreCase("Premium")) {
                        Premium a = new Premium();
                        a.setHarga(pilih);
                        a.setDiskon();
                        a.setBayar();

                    } else if (ang.equalsIgnoreCase("Gold")) {
                        Gold b = new Gold();
                        b.setHarga(pilih);
                        b.setDiskon();
                        b.setBayar();
                    } else if (ang.equalsIgnoreCase("Silver")) {
                        Silver c = new Silver();
                        c.setHarga(pilih);
                        c.setDiskon();
                        c.setBayar();
                    } else {
                        TnpAnggota d = new TnpAnggota();
                        d.setHarga(pilih);
                        d.setDiskon();
                        d.setBayar();
                    }
                    break;

                case 4:
                    break;

            }

        } while (pilihan != 4);

    }

}
