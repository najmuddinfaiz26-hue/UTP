package UTP;
//Muhammad Faiz Najmuddin
//255150707111013
class Regular extends Member {
    public Regular(String id, String nama) {
        super(id, nama);
    }

    @Override
    public int hitungPembayaran(int hargaDasar, int sesi) {
        int harga = hargaDasar * sesi;

        if (sesi > 5) {
            harga -= (harga * 10) / 100;
        }

        int pajak = (harga * 5) / 100;
        return harga + pajak;
    }
}
