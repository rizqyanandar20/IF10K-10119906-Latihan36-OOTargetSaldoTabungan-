/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan36.ootargetsaldotabungan;

/**
 *
 * @author senenngahenen
 */
public class IF10K10119906Latihan36OOTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        TargetSaldoTabungan saldotabungan = new TargetSaldoTabungan();
        saldotabungan.HitungSaldoTabungan(saldo, bulan, bunga);
        
    }
    
}
