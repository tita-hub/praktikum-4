package Encapsulation;
public class AkunBankTest {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank(50);
        AkunBank akun2 = new AkunBank(0);
        AkunBank akun3 = new AkunBank(100);

        System.out.println("Saldo awal Akun1: Rp" + akun1.getSaldo());
        System.out.println("Saldo awal Akun2: Rp" + akun2.getSaldo());
        System.out.println("Saldo awal Akun3: Rp" + akun3.getSaldo());
        System.out.println();

        akun1.tabung(30);
        akun1.tarik(20);
        System.out.println("Saldo akhir Akun1: Rp" + akun1.getSaldo());
        System.out.println();

        akun2.tabung(100);
        akun2.tarik(200);
        System.out.println("Saldo akhir Akun2: Rp" + akun2.getSaldo());
        System.out.println();

        akun3.tarik(30);
        akun3.tabung(70);
        System.out.println("Saldo akhir Akun3: Rp" + akun3.getSaldo());
    }
}
