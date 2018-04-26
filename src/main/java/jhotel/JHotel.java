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
 * @version 2018.03.08
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

        SpringApplication.run(JHotel.class, args);

        Lokasi jakarta = new Lokasi(99, 99, "Jakarta");
        Lokasi bandung = new Lokasi(80, 80, "Bandung");

        DatabaseHotel.addHotel(new Hotel("Melati", jakarta, 10));
        DatabaseHotel.addHotel(new Hotel("Mawar", bandung, 8));

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "IO401"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "YT404"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2), "ZT707"));

    }

}
