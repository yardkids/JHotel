package jhotel;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    public static ArrayList<Hotel> getHotelDatabase(){
        return HOTEL_DATABASE;
    }

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
