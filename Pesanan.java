
/**
 * Class ini digunakan untuk menampilkan/memodelkan suatu
 * bentuk pesanan yang ada baik dalam segi pelanggan yang ada
 * beserta status yang dimiliki, yang dalam hal ini merupakan biaya
 * jenis kamar yang ada, dan juga apakah masih menginap atau tidak
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.02.22
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    public Customer pelanggan;
    private String nama_pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan()
    {
        // initialise instance variables
        
    }

    public double getBiaya(){
    
        return 0;
    }
    
    public Customer getPelanggan(){
        
        return null;
    }
    
    public boolean getStatusDiproses(){
    
        return false;
    }
    
    public boolean getStatusSelesai(){
    
        return false;
    }
}
