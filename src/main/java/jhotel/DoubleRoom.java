package jhotel;
/**
 * Kelas ini digunakan untuk memodelkan tipe kamar double room
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    public static TipeKamar TIPE_KAMAR = TipeKamar.Double;
    public Customer customer2;
    
    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    /**
     * Method ini digunakan untuk mengambil customer
     * @return customer2
     */
    public Customer getCustomer2(){
        return customer2;
    }

    /**
     * Method ini digunakan untuk mengambil nilai tipe kamar
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }

    /**
     * Method ini digunakan untuk menentukan nilai customer
     * @param customer2
     */
    public void setCustomer2(Customer customer2){
        this.customer2 = customer2;
    }
}
