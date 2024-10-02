// 12S24009 - Kezia Pasaribu
// 12S24049 - Rimanda Panjaitan

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[10], judulBuku = new String[10], penulis = new String[10], penerbit = new String[10], formatBukuElektranik = new String[10], kategori = new String[10], tub = new String[10], diskon = new String[10];
        int[] tahunTerbit = new int[10], stok = new int[10];
        double[] hargaPembelian = new double[10], minimumMargin = new double[10], rating = new double[10], harga = new double[10], margin = new double[10], kategoriDiskon = new double[10];
        int i;

        i = 0;
        do {
            iSBN[i] = input.nextLine();
            if (iSBN.equals("---")) {
            }
            judulBuku = input.nextLine();
            penulis = input.nextLine();
            tahunTerbit = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            formatBukuElektranik = input.nextLine();
            hargaPembelian = Double.parseDouble(input.nextLine());
            minimumMargin = Double.parseDouble(input.nextLine());
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7 && rating <= 5) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Average";
                        } else {
                            if (rating < 3.0) {
                                kategori = "Low";
                            } else {
                                kategori = "Error";
                            }
                        }
                    }
                }
            }
            kategoriDiskon = margin / harga * -1;
            if (kategoriDiskon >= (double) 40 / 100) {
                diskon = "Once in a lifetime";
            } else {
                if (kategoriDiskon > (double) 20 / 100) {
                    diskon = "Never come twice";
                } else {
                    if (kategoriDiskon > 0) {
                        diskon = "No regret";
                    } else {
                        diskon = "---";
                    }
                }
            }
            if (kategori.equals("Best Pick") && diskon.equals("Once in lifetime")) {
                tub = "The ultimate best";
            } else {
                tub = "---";
            }
            i = i + 1;
        } while (!iSBN.equals("---"));
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + diskon + "|" + tub);
    }
}
