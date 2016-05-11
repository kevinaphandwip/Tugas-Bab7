package tugasbab7;

public class Silver extends Salon {

    @Override
    public void setDiskon() {
        diskon = 0.1 + diskon;
    }

    public void setBayar() {
        harga = harga - harga * diskon;
        System.out.printf("Harga yang harus dibayar:Rp.%6.0f ", harga);
        System.out.println("");
    }
}
