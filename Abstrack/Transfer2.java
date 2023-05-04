package Abstrack;

public class Transfer2 extends CryptoTransfer {
    private String namaExchange;
    private String addressCoin2;

    public Transfer2 (String nama, double saldo, String namaExchange, String addressCoin2){
        super(nama, saldo);
        this.namaExchange = namaExchange;
        this.addressCoin2 = addressCoin2;
    }

    public boolean TransferCoin (double jumlah){
        if (jumlah <= saldo){
            saldo -= jumlah;
            System.out.println("Transfer XRP Berhasil!");
            return true;
        } else {
            System.out.println("Transfer XRP Gagal!");
            return false;
        }
    }
}