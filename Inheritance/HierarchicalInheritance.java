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

class Deposito extends AkunBank {
    void bungaTinggi() {
        System.out.println("Deposito dengan bunga tinggi.");
    }
}

class Giro extends AkunBank {
    void cekSaldo() {
        System.out.println("Cek saldo giro.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tabungan t = new Tabungan();
        Deposito d = new Deposito();
        Giro g = new Giro();

        t.infoAkun();
        t.setorUang();

        d.infoAkun();
        d.bungaTinggi();

        g.infoAkun();
        g.cekSaldo();
    }
}
