package tugasbab7;

public abstract class Salon {

    double diskon = 0.1;
    double harga;

    public abstract void setDiskon();

    public void setHarga(String barang) {
        if (barang.equalsIgnoreCase("sampo")) {
            this.harga = 20000;
        } else if (barang.equalsIgnoreCase("sabun")) {
            this.harga = 10000;
        } else if (barang.equalsIgnoreCase("bedak")) {
            this.harga = 40000;
        } else if (barang.equalsIgnoreCase("pijet")) {
            this.harga = 100000;
        } else if (barang.equalsIgnoreCase("Bedak")) {
            this.harga = 40000;
        } else if (barang.equalsIgnoreCase("Creambath")) {
            this.harga = 25000;
        } else if (barang.equalsIgnoreCase("Potongrambut")) {
            this.harga = 35000;
        } else {
            System.out.println("Barang tidak ada");
        }

    }

}
