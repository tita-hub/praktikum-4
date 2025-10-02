package Encapsulation;
public class AkunBank {
    private int saldo;

    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void tabung(int jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil menabung Rp" + jumlah);
        } else {
            System.out.println("Jumlah tabungan harus lebih dari 0");
        }
    }

    public void tarik(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik tunai Rp" + jumlah);
        } else {
            System.out.println("Saldo tidak cukup atau jumlah tidak valid");
        }
    }
}
