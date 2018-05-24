package jhotel;

/**
 * Kelas ini digunakan untuk memodelkan tipe kamar single
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    
    public static TipeKamar TIPE_KAMAR = TipeKamar.Single;
    
    /**
     * Constructor for objects of class SingleRoom
     * @Params hotel, nomor_kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        
    }

    /**
     *  Method ini digunakan untuk mendapatkan nilai tipe kamar
     *  @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
}
