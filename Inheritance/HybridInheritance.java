interface TransaksiOnline {
    void transfer();
}

class AkunBank {
    void infoAkun() {
        System.out.println("Ini adalah akun bank.");
    }
}

class Tabungan extends AkunBank {
    void setorUang() {
        System.out.println("Setor uang ke tabungan.");
    }
}

class TabunganDigital extends Tabungan implements TransaksiOnline {
    public void transfer() {
        System.out.println("Transfer melalui tabungan digital.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        TabunganDigital td = new TabunganDigital();
        td.infoAkun();
        td.setorUang();
        td.transfer();
    }
}