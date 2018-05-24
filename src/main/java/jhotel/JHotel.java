package jhotel;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Kelas ini digunakan untuk memodelkan JHotel yang menjadi
 * Class utama untuk menjalankan JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class JHotel
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JHotel
     */
    public JHotel()
    {
        // initialise instance variables
        
    }
    
    
    /**
     *  Method ini digunakan untuk sebagai method utama dalam menjalankan jhotel
     */
    public static void main(String[] args) throws PelangganSudahAdaException, PelangganTidakDitemukanException, PesananSudahAdaException,
        HotelSudahAdaException, HotelTidakDitemukanException, RoomSudahAdaException, RoomTidakDitemukanException{

        Lokasi artenheim = new Lokasi(99, 99, "Artenheim");

        DatabaseHotel.addHotel(new Hotel("Yggdrasil", artenheim, 10));

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "IO401"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "YT404"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "ZT707"));
        DatabaseRoom.getRoomDatabase().get(0).setDailyTariff(500000);
        DatabaseRoom.getRoomDatabase().get(1).setDailyTariff(750000);
        DatabaseRoom.getRoomDatabase().get(2).setDailyTariff(1200000);

        SpringApplication.run(JHotel.class, args);

    }

}
