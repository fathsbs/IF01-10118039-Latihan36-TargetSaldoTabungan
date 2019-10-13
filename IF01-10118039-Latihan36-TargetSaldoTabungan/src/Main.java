/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menghitung target tabungan  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        targetTabungan nabung = new targetTabungan();
        nabung.saldo = 3500000;
        nabung.bunga = 8;
        int saldoTarget = 6000000;
        
        nabung.targetBulanan(nabung.saldo, saldoTarget);
    }

}
