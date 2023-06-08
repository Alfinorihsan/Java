import java.util.Scanner;

public class Soal1 {
    private static final String originalString = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
    private static boolean kembaliKeMenuUtama = false;
    private static Scanner scanner = new Scanner(System.in);

    public static boolean printSubstring() {
        System.out.println(originalString);

        int choice;
        do {
            System.out.println("Pilih substring yang ingin ditampilkan:");
            System.out.println("1\tJavaScript adalah bahasa pemrograman");
            System.out.println("2\tjavascript adalah bahasa pemrograman");
            System.out.println("3\tJAVASCRIPT ADALAH BAHASA PEMROGRAMAN");
            System.out.println("4\tpemrograman");
            System.out.println("5\ttingkat tinggi dan dinamis");
            System.out.println("6\tKembali ke menu utama");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(originalString.substring(0, 36));
                    break;
                case 2:
                    System.out.println(originalString.substring(0, 36).toLowerCase());
                    break;
                case 3:
                    System.out.println(originalString.substring(0, 36).toUpperCase());
                    break;
                case 4:
                    System.out.println(originalString.substring(25, 36));
                    break;
                case 5:
                    System.out.println(originalString.substring(37, 63));
                    break;
                case 6:
                    System.out.println("Kembali ke menu utama...");
                    kembaliKeMenuUtama = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-6.");
                    break;
            }

            System.out.println();
        } while (choice != 6);

        return kembaliKeMenuUtama;
    }
}
