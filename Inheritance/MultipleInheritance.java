interface TransaksiOnline {
    void transfer();
}

interface LayananSMS {
    void kirimSMS();
}

class MobileBanking implements TransaksiOnline, LayananSMS {
    public void transfer() {
        System.out.println("Transfer uang melalui mobile banking.");
    }

    public void kirimSMS() {
        System.out.println("Kirim SMS notifikasi.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MobileBanking mb = new MobileBanking();
        mb.transfer();
        mb.kirimSMS();
    }
}
