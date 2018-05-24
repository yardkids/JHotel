package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila kamar yang
 * ingin dihapus tidak dapat ditemukan
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class RoomTidakDitemukanException extends Exception{
    private Hotel hotel_error;
    private String room_error;

    /**
     *  Method ini merupakan konstruktor dari kelas yang ada
     *  @params hotel_input, room_input
     */
    public RoomTidakDitemukanException(Hotel hotel_input, String room_input){
        super("Kamar yang terletak di : ");
        hotel_error = hotel_input;
        room_error = room_input;
    }

    /**
     *  Method ini digunakan untuk menampilkan string pesan
     *
     */
    public String getPesan(){
        return super.getMessage() + hotel_error + " dan dengan nomor kamar  " + room_error + " tidak ditemukan.";
    }
}
