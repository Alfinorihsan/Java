// Class Soal2
public class Soal2 {
    public static double calculateFinalScore(int kehadiran, double uts, double uas) {
        double nilaiKehadiran = 0;

        if (kehadiran < 3) {
            nilaiKehadiran = 0;
        } else if (kehadiran >= 3 && kehadiran <= 4) {
            nilaiKehadiran = 60;
        } else if (kehadiran >= 5 && kehadiran <= 6) {
            nilaiKehadiran = 80;
        } else if (kehadiran > 7) {
            nilaiKehadiran = 100;
        }

        double nilaiAkhir = (0.2 * nilaiKehadiran) + (0.3 * uts) + (0.5 * uas);
        return nilaiAkhir;
    }

    public static String convertToGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            return "A";
        } else if (nilaiAkhir >= 70 && nilaiAkhir <= 84) {
            return "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir <= 69) {
            return "C";
        } else if (nilaiAkhir >= 50 && nilaiAkhir <= 59) {
            return "D";
        } else {
            return "E";
        }
    }
}
