import java.util.ArrayList;

/**
 * Kelas ini berisi untuk memodelkan database Customer yang akan dimasukan
 * dimana mengenai menambahkan dan menghapus data customer yang ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     *  Method ini digunakan untuk menampilkan database dari semua customer
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }
    
    /**
     *  Method ini digunakan untuk melakukan penambahan data customer yang ada
     *  @param baru
     */
    public static boolean addCustomer(Customer baru){
        for(Customer cust: CUSTOMER_DATABASE)
        {
            if(cust.getID() == baru.getID())
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id){
        for(Customer cust: CUSTOMER_DATABASE)
        {
            if(cust.getID() == id)
            {
                return cust;
            }
        }
        return null;
    }

    /**
     *  Method ini digunakan untuk menghapus data customer yang ada
     *  @param id
     */
    public boolean removeCustomer(int id){
        for(Customer cust: CUSTOMER_DATABASE)
        {
            if(cust.getID() == id)
            {
                Pesanan pesan = DatabasePesanan.getPesananAktif(cust);
                DatabasePesanan.removePesanan(pesan);
                if(CUSTOMER_DATABASE.remove(cust))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
