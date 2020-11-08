/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan36.ootargetsaldotabungan;
import java.text.DecimalFormat;
/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class TargetSaldoTabungan {
    public void HitungSaldoTabungan(int saldo, double bulan, double bunga){
        DecimalFormat df = new DecimalFormat("#,###,##0");
        int i;
        for(i = 1; saldo<=6000000; i++){
            bulan = bunga * saldo;
            saldo = (int) (saldo + bulan);
            System.out.println("Saldo di Bulan ke-" + i +" Rp." + df.format(saldo));
            }
        }
    
}
