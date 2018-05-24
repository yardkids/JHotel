package jhotel;

/**
 * Kelas ini digunakan untuk memodelkan tipe kamar premium
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
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

    /**
     * Method ini digunakan untuk mengambil nilai dari Tipe Kamar
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }

    /**
     * Method ini digunakan untuk mengambil nilai dari diskon yang ditentukan
     * @return DISCOUNT
     */
    public double getDiscount(){
        return DISCOUNT;
    }

    /**
     * Method ini digunakan untuk menentukan nilai dari daily tariff
     * yang mana merupakan hasil dari nilai tariff yang ditetapkan dikali
     * dengan diskon
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff * DISCOUNT;
    }
}
