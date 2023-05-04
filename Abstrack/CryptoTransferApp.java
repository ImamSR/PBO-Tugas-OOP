package Abstrack;

public class CryptoTransferApp {
    public static void main(String[] args) {
        Transfer M2 = new Transfer("Imam",9999999, "1234567890");
        M2.TransferCoin(10000000);

        Transfer2 M1 = new Transfer2("Imam", 999999, "Binance", "1234567890");
        M1.TransferCoin(10000000);
    }
}