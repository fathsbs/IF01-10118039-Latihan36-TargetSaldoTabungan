/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menghitung target tabungan  
 */

/**
 *
 * @author Fatahillah Seno
 */
public class targetTabungan {

    public int bunga;
    public int saldo;

    public double hitungBunga(int parSaldo, int parBunga) {
        return parSaldo * parBunga / 100;
    }

    public void targetBulanan(int parSaldo, int parSaldoTarget) {
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo, bunga);
            parSaldo += hitungBunga(parSaldo, bunga);
            String hasilSaldo = String.format("%,3d", parSaldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-%d Rp. %s%n", i, hasilSaldo);
            i++;

        }
    }
}
