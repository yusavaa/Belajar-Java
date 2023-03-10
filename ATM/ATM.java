import java.util.Scanner;

public class ATM {
    static Scanner input = new Scanner(System.in);
    static int saldo = 0;

    public static void main(String[] args) {

        for (int i = 2; i >= 0; i--) {
            System.out.print("Masukkan Pin: ");
            String pin = input.nextLine();

            if (pin.equals("112233")) {
                System.out.println();
                display();
            } else {
                System.out.println("Pin yang anda masukkan salah, sisa kesempatan " + i + " lagi.");
            }
        }
        System.out.println("Blocked.");

    }

    static void display() {
        System.out.println("Anjungan Tunai Mandiri");
        System.out.println("======================");
        System.out.println("(1) Cek saldo");
        System.out.println("(2) Deposito");
        System.out.println("(3) Tarik Tunai");
        System.out.println("(4) Kirim saldo");
        System.out.println("----------------------");
        System.out.println("(5) Selesai");
        System.out.println("======================");

        while (true) {
            menu();
        }
    }

    static void menu() {
        System.out.println();
        System.out.print("Masukkan pilihan (Angka): ");
        String menu = input.nextLine();

        switch (menu) {
            case "1":
                saldo();
                break;
            case "2":
                deposit();
                break;
            case "3":
                tarikTunai();
                break;
            case "4":
                transfer();
                break;
            case "5":
                System.exit(0); // terminate the program
                break;
            default:
                System.out.println("Masukkan nomor 1 - 5");
                break;
        }
    }

    static void saldo() {
        System.out.println("Saldo anda Rp." + saldo + ",-");
    }

    static void deposit() {
        System.out.print("Jumlah deposit: Rp.");
        int deposit = input.nextInt();

        if (deposit != 0) {
            saldo += deposit;
            System.out.println("Berhasil deposit sebanyak Rp." + deposit + ",-");
        } else {
            System.out.println("Minimal deposit Rp.1");
        }
        input.nextLine();
    }

    static void tarikTunai() {
        System.out.print("Jumlah yang ingin ditarik: ");
        int tunai = input.nextInt();

        if (tunai != 0) {
            if (saldo >= tunai) {
                saldo -= tunai;
                System.out.println("Saldo berhasil ditarik.");
                System.out.println("Sisa saldo anda: Rp." + saldo + ",-");
            } else {
                System.out.println("Sisa saldo anda kurang untuk melakukan tarik tunai");
            }
        } else {
            System.out.println("Minimum penarikan Rp.50000,-");
        }
    }

    static void transfer() {
        System.out.print("Nomor rekening tujuan: ");
        String rekening = input.nextLine();

        System.out.print("Jumlah tranfer: Rp.");
        int tranfer = input.nextInt();

        input.nextLine();

        if (tranfer != 0) {
            if (saldo >= tranfer) {
                saldo -= tranfer;
                System.out.println("Saldo berhasil ditransfer ke rekening " + rekening);
                System.out.println("Sisa saldo anda: Rp." + saldo + ",-");
            } else {
                System.out.println("Sisa saldo anda kurang untuk melakukan transfer");
            }
        } else {
            System.out.println("Minimum transfer Rp.1,-");
        }
    }
}
