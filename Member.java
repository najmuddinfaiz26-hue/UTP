package UTP;
//Muhammad Faiz Najmuddin
//255150707111013
abstract class Member {
    protected String id;
    protected String nama;
    protected int saldo;

    public Member(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.saldo = 0;
    }

    public void topUp(int jumlah) {
        saldo += jumlah;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getInfo() {
        return id + " | " + nama + " | " + this.getClass().getSimpleName() + " | saldo: " + saldo;
    }

    public int buy(String layanan, int sesi) {
        int hargaDasar = 0;
        switch (layanan) {
            case "cardio": hargaDasar = 20000; break;
            case "yoga": hargaDasar = 25000; break;
            case "personal_training": hargaDasar = 40000; break;
            default: 
                System.out.println("Layanan tidak valid");
                return -1;
        }

        int total = hitungPembayaran(hargaDasar, sesi);

        if (saldo < total) {
            System.out.println("Saldo " + id + " tidak cukup");
            return -1;
        }

        saldo -= total;
        System.out.println("Total bayar " + id + ": " + total);
        System.out.println("Saldo " + id + ": " + saldo);
        return total;
    }

    public abstract int hitungPembayaran(int hargaDasar, int sesi);
}
