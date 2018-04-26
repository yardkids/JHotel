package jhotel;
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
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException{
        for(Customer cust: CUSTOMER_DATABASE)
        {
            if(cust.getEmail() == baru.getEmail()||cust.getID() == baru.getID())
            {
                throw new PelangganSudahAdaException(baru);
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

    public static Customer getCustomerLogin(String email, String password){
        for(Customer cust: CUSTOMER_DATABASE){
            if(cust.getEmail().equals(email)&&cust.getPassword().equals(password)){
                return cust;
            }
        }
        return null;
    }

    /**
     *  Method ini digunakan untuk menghapus data customer yang ada
     *  @param id
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException{
            for(Customer cust: CUSTOMER_DATABASE)
            {
                if(cust.getID() == id)
                {
                    Pesanan pesan = DatabasePesanan.getPesananAktif(cust);
                    try {
                        DatabasePesanan.removePesanan(cust);
                    }
                    catch (PesananTidakDitemukanException except){
                        System.out.println(except.getPesan());
                    }
                    if(CUSTOMER_DATABASE.remove(cust))
                    {
                        return true;
                    }
                }
            }
        throw new PelangganTidakDitemukanException(id);
    }
    
}
