
/**
 * Kelas ini berisi mengenai Database pesanan yang dilakukan, termasuk
 * mengenai pesanan yang akan dilakukan ataupun menghapus pesanan yang sudah
 * ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.01
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private String[] list_pesanan;

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        
    }
    
    /**
     *  Method ini digunakan untuk melakukan penambahan dari Pesanan yang ada
     *  @param baru
     */
    public boolean addPesanan(Pesanan baru){
        return false;
    }
    
    /**
     *  Method ini digunakan untuk menghapus pesanan dari data yang ada
     *  @param pesan
     */
    public boolean removePesanan(Pesanan pesan){
        return false;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan pesanan yang ada dari semua data pesanan
     *  @param cust
     */
    public Pesanan getPesanan(Customer cust){
        return null;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan database keseluruhan pesanan
     */
    public String[] getPesananDatabase(){
        return null;
    }
    
    
    /**
     *  Method ini digunakan untuk melakukan pembatalan pesanan yang sudah dilakukan
     *  @param pesan
     */
    public void pesananDibatalkan(Pesanan pesan){
    
    }

}
