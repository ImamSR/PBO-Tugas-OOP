package Abstrack;

public abstract class CryptoTransfer {
    protected String nama;
    protected double saldo;

    public CryptoTransfer (String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public abstract boolean TransferCoin (double jumlah);
}