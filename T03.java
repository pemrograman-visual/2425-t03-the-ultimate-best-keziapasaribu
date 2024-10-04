// 12S24009 - Kezia Pasaribu
// 12S24049 - Rimanda Panjaitan

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBukuElektranik, grade, kategori, kategoribuku;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating, diskon;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatBukuElektranik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimumMargin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                diskon = minimumMargin / hargaPembelian * -1 * 100;
                if (diskon >= 40) {
                    kategori = "Once in a lifetime";
                } else {
                    if (diskon > 20) {
                        kategori = "Never come twice";
                    } else {
                        if (diskon > 0) {
                            kategori = "No regret";
                        } else {
                            kategori = "---";
                        }
                    }
                }
                if (rating >= 4.7) {
                    grade = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        grade = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            grade = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                grade = "Average";
                            } else {
                                if (rating < 3.0) {
                                    grade = "Low";
                                } else {
                                    grade = "---";
                                }
                            }
                        }
                    }
                }
                if (rating >= 4.7 && diskon > 40) {
                    kategoribuku = "The ultimate best";
                } else {
                    kategoribuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + grade + "|" + kategori + "|" + kategoribuku);
            }
        } while (!iSBN.equals("---"));
    }
}
