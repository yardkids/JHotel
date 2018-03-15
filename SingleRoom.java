
/**
 * Write a description of class SingleRoom here.
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.15
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    
    public static TipeKamar TIPE_KAMAR = TipeKamar.Single;
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
        
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
}
