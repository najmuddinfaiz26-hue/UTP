package UTP;
import java.util.*;
//Muhammad Faiz Najmuddin
//255150707111013
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GymSystem gym = new GymSystem();

        int N = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String cmd = parts[0];

            switch (cmd) {
                case "ADD":
             
                    String tipe = parts[1];
                    String id = parts[2];
                    String nama = parts[3];
                    gym.addMember(tipe, id, nama);
                    break;

                case "TOPUP":
                    
                    id = parts[1];
                    int jumlah = Integer.parseInt(parts[2]);
                    gym.topUp(id, jumlah);
                    break;

                case "BUY":
                  
                    id = parts[1];
                    String layanan = parts[2];
                    int sesi = Integer.parseInt(parts[3]);
                    gym.buy(id, layanan, sesi);
                    break;

                case "CHECK":
                  
                    id = parts[1];
                    gym.check(id);
                    break;

                case "COUNT":
                    gym.count();
                    break;

                default:
                    System.out.println("Perintah tidak valid");
            }
        }

        sc.close();
    }
}
