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

public class SingleInheritance {
    public static void main(String[] args) {
        Tabungan t = new Tabungan();
        t.infoAkun();
        t.setorUang();
    }
}
