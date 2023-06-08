import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1. Soal 1");
            System.out.println("2. Soal 2");
            System.out.println("0. Keluar");
            System.out.print("Pilih salah satu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                if (Soal1.printSubstring()) {
                    choice = -1;
                }
                break;
                case 2:
                    System.out.print("Kehadiran: ");
                    int kehadiran = scanner.nextInt();

                    System.out.print("Nilai UTS: ");
                    double uts = scanner.nextDouble();

                    System.out.print("Nilai UAS: ");
                    double uas = scanner.nextDouble();

                    double nilaiAkhir = Soal2.calculateFinalScore(kehadiran, uts, uas);
                    String grade = Soal2.convertToGrade(nilaiAkhir);

                    System.out.println("Nilai Akhir: " + nilaiAkhir);
                    System.out.println("Grade: " + grade);
                    break;
                case 0:
                    System.out.println("Terima kasih! Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 0.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
