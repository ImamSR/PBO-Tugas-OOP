package AbstrakClass;

public class CryptoTransferApp {
    public static void main(String[] args) {
        Transfer2 M1 = new Transfer2("Fauzan", 1000000, "BRI", "1234567890");
        M1.TransferCoin(500000);

        Transfer M2 = new Transfer("Fauzan", 1000000, "1234567890");
        M2.TransferCoin(500000);
    }
}