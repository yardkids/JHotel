
/**
 * Write a description of class DoubleRoom here.
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.15
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    public static TipeKamar TIPE_KAMAR = TipeKamar.Double;
    public Customer customer2;
    
    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
    }  

    public Customer getCustomer2(){
        return customer2;
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public void setCustomer2(Customer customer2){
        this.customer2 = customer2;
    }
}
