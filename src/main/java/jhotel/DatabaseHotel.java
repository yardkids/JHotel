package jhotel;
import java.util.ArrayList;

/**
 * Kelas ini digunakan untuk memodelkan terkait penyimpanan
 * data hotel, serta dapat melakukan penambahan dan pengecekan
 * Hotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Method yang digunakan untuk mengambil semua data dari database untuk dikontrol
     * @return
     */
    public static ArrayList<Hotel> getHotelDatabase(){
        return HOTEL_DATABASE;
    }

    /**
     * Method yang digunakan untuk mengambil nilai dari last hotel id yang ada
     * @return
     */
    public static int getLastHotelID(){
        return LAST_HOTEL_ID;
    }
    
    /**
     *  Method ini digunakan untuk menambahkan hotel baru kedalam database
     *  @param baru
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
        for(Hotel hotel: HOTEL_DATABASE)
        {
            if(hotel.getID() == baru.getID()||(hotel.getNama()== baru.getNama()&&hotel.getLokasi() == baru.getLokasi()))
            {
                throw new HotelSudahAdaException(baru);
            }
        }
        LAST_HOTEL_ID = baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    /**
     * Method ini digunakan untuk mengambil hotel berdasarkan pada id yang diberikan
     * @param id
     */
    public static Hotel getHotel(int id){
        for(Hotel hotel: HOTEL_DATABASE)
        {
            if(hotel.getID() == id)
            {
                return hotel;
            }
        }
        return null;
    }
    
    /**
     *  Method ini digunakan untuk menghapus hotel dari database menggunakan id
     *  @param id
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException{
        for(Hotel hotel: HOTEL_DATABASE)
        {
            if(hotel.getID() == id)
            {
                ArrayList<Room> kamar_size = DatabaseRoom.getRoomsFromHotel(hotel);
                for (int x = 0; x < kamar_size.size(); x++){
                    Room kamar = kamar_size.get(x);
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch(RoomTidakDitemukanException except){
                        System.out.println(except.getPesan());
                    }

                }
                if(HOTEL_DATABASE.remove(hotel))
                {
                    return true;
                }
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
    

}
