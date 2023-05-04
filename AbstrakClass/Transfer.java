package AbstrakClass;

public class Transfer extends CryptoTransfer{
    private String address;

    public Transfer (String nama, double saldo, String address){
        super(nama, saldo);
        this.address = address;
    }

    @Override
    public boolean TransferCoin (double jumlah){
        if (jumlah <= saldo){
            saldo -= jumlah;
            System.out.println("Transfer Cardano Berhasil!");
            return true;
        } else {
            System.out.println("Transfer Cardano Gagal!");
            return false;
        }
    }
}