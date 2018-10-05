
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        nasabah n=new nasabah();
        n.nasabah("Saji Yogie Permana");
        n.tabungan(5000000);
        n.ambilUang(4000000);
        n.ambilUang(50000,"Uang untuk bayar kuliah");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        nasabah n4=new nasabah();
        n4.nasabah("Thanos");
        n4.tabungan(6000000);
        n4.ambilUang(4000000);
        n4.ambilUang(2000000,"Uang untuk beli mind stone");

        System.out.println(n4.getSaldo());
        System.out.println(n4.getSaldo() + "  " + n4.getPesan());

        System.out.println();
        nasabah n1=new nasabah();
        n1.nasabah("Tony stark");
        n1.tabungan(150000000);
        n1.ambilUang(100000000);
        n1.ambilUang(400000000,"Uang untuk penelitian The avenger");
        
        System.out.println("\nTotal Transaksi Ambil Uang : " + n1.noUrut);

        nasabah n2=new nasabah();
        n2.nasabah("Bruce wayne");
        n2.tabungan(40000000);
        n2.ambilUang(15000000);
        n2.ambilUang(5000000,"Uang untuk mengganti kerusakkan");
        
        System.out.println("\nTotal Transaksi Ambil Uang : " + n2.noUrut);
        
    }
    
}
