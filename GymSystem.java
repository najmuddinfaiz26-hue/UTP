package UTP;

import java.util.*;
//Muhammad Faiz Najmuddin
//255150707111013
class GymSystem {
    private List<Member> members = new ArrayList<>();

    public void addMember(String tipe, String id, String nama) {
        if (findMember(id) != null) {
            System.out.println("Member sudah terdaftar");
            return;
        }

        Member m;
        if (tipe.equalsIgnoreCase("REGULER")) {
            m = new Regular(id, nama);
        } else if (tipe.equalsIgnoreCase("VIP")) {
            m = new VIP(id, nama);
        } else {
            System.out.println("Tipe member tidak valid");
            return;
        }

        members.add(m);
        System.out.println(tipe + " " + id + " berhasil ditambahkan");
    }

    public void topUp(String id, int jumlah) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        m.topUp(jumlah);
        System.out.println("Saldo " + id + ": " + m.getSaldo());
    }

    public void buy(String id, String layanan, int sesi) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        m.buy(layanan, sesi);
    }

    public void check(String id) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        System.out.println(m.getInfo());
    }

    public void count() {
        System.out.println("Total member: " + members.size());
    }

    public Member findMember(String id) {
        for (Member m : members) {
            if (m.id.equals(id)) return m;
        }
        return null;
    }
}
