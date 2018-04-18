
/**
 * Write a description of class PremiumRoom here.
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.15
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    public static TipeKamar TIPE_KAMAR = TipeKamar.Premium;
    public static double DISCOUNT = 0.3;
    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public double getDiscount(){
        return DISCOUNT;
    }
    
    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff * DISCOUNT;
    }
}
