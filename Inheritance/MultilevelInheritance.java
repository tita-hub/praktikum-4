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

class TabunganMahasiswa extends Tabungan {
    void bonus() {
        System.out.println("Tabungan mahasiswa mendapatkan bonus khusus.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        TabunganMahasiswa tm = new TabunganMahasiswa();
        tm.infoAkun();
        tm.setorUang();
        tm.bonus();
    }
}
