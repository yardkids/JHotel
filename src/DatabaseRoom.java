import java.util.ArrayList;

/**
 * Write a description of class DatabaseRoom here.
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * Constructor for objects of class DatabaseRoom
     */
    public static ArrayList<Room> getRoomDatabase(){
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru){
        for (int i = 0; i < ROOM_DATABASE.size(); i++){
            if (ROOM_DATABASE.get(i).getHotel().equals(baru.getHotel())&&ROOM_DATABASE.get(i).getNomorKamar()==baru.getNomorKamar()){
                return false;
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel().equals(hotel)&&ROOM_DATABASE.get(i).getNomorKamar()==nomor_kamar){
                return ROOM_DATABASE.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> datakamar = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel().equals(hotel)){
                datakamar.add(ROOM_DATABASE.get(i));
            }
        }
        return datakamar;
    }

    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> datakamar = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getStatusKamar()==StatusKamar.Vacant){
                datakamar.add(ROOM_DATABASE.get(i));
            }
        }
        return datakamar;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel().equals(hotel)&&ROOM_DATABASE.get(i).getNomorKamar()==nomor_kamar){
                if(DatabasePesanan.getPesanan(ROOM_DATABASE.get(i)) != null)
                {
                    Administrasi.pesananDibatalkan(ROOM_DATABASE.get(i));
                }

                if(ROOM_DATABASE.remove(ROOM_DATABASE.get(i)))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
