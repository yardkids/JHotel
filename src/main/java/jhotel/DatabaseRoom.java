package jhotel;
import java.util.ArrayList;

/**
 * Kelas ini digunakan untuk segala yang berhubungan dengan database kamar
 * baik itu untuk melakukan penambahan ataupun penghapusan kamar
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
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

    /**
     * Method yang digunakan untuk menambahkan kamar yang dibuat kedalam database kamar
     * @param baru
     * @throws RoomSudahAdaException
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        for (int i = 0; i < ROOM_DATABASE.size(); i++){
            if (ROOM_DATABASE.get(i).getHotel() == baru.getHotel()&&ROOM_DATABASE.get(i).getNomorKamar()==baru.getNomorKamar()){
                throw new RoomSudahAdaException(ROOM_DATABASE.get(i));
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * Method yang digunakan untuk mengambil kamar yang ada pada database
     * @param hotel
     * @param nomor_kamar
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel().equals(hotel)&&ROOM_DATABASE.get(i).getNomorKamar().equals(nomor_kamar)){
                return ROOM_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * Method yang digunakan untuk mengambil data kamar dari database
     * @param hotel
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> datakamar = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel().equals(hotel)){
                datakamar.add(ROOM_DATABASE.get(i));
            }
        }
        return datakamar;
    }

    /**
     * Method yang digunakan untuk mengambil kamar yang dalam keadaan vacant
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> datakamar = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getStatusKamar().equals(StatusKamar.Vacant)){
                datakamar.add(ROOM_DATABASE.get(i));
            }
        }
        return datakamar;
    }

    /**
     * Method yang digunakan untuk menghapus kamar
     * @param hotel
     * @param nomor_kamar
     * @throws RoomTidakDitemukanException
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException{
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            if (ROOM_DATABASE.get(i).getHotel().equals(hotel)&&ROOM_DATABASE.get(i).getNomorKamar().equals(nomor_kamar)){
                if(DatabasePesanan.getPesananAktif(ROOM_DATABASE.get(i)) != null)
                {
                    Administrasi.pesananDibatalkan(ROOM_DATABASE.get(i));
                }

                if(ROOM_DATABASE.remove(ROOM_DATABASE.get(i)))
                {
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }
}
