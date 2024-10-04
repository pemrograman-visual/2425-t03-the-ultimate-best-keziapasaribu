// 12S24009 - Kezia Pasaribu
// 12S24049 - Rimanda Panjaitan

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulBuku, penulis, penerbit, formatBukuElektranik, kategoriDiskon, kategoriBuku;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                judulBuku = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatBukuElektranik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimumMargin = Double.parseDouble(input.nextLine());
                if (minimumMargin > 0) {
                    kategoriDiskon = "---";
                } else {
                    if (minimumMargin >= hargaPembelian * 40 / 100) {
                        kategoriDiskon = "Once in a lifetime";
                    } else {
                        if (minimumMargin <= hargaPembelian * 30 / 100) {
                            kategoriDiskon = "Never come twice";
                        } else {
                            kategoriDiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7 && rating <= 5) {
                    kategoriBuku = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategoriBuku = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kategoriBuku = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategoriBuku = "Average";
                            } else {
                                if (rating < 3.0) {
                                    kategoriBuku = "Low";
                                } else {
                                    kategoriBuku = "Error";
                                }
                            }
                        }
                    }
                }
                if (kategoriDiskon.equals("Once in a lifetime") && kategoriBuku.equals("Best Pick")) {
                    kategoriBuku = "The ultimate best";
                } else {
                    kategoriBuku = "---";
                }
                System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategoriDiskon + "|" + kategoriBuku);
            }
        } while (!iSBN.equals("---"));
    }
}
