package tugasbab7;

public class Premium extends Salon {

    @Override
    public void setDiskon() {
        diskon = diskon + 0.2;
    }

    public void setBayar() {
        harga = harga - harga * diskon;
        System.out.printf("Harga yang harus dibayar:Rp.%6.0f ", harga);
        System.out.println("");
    }

}
