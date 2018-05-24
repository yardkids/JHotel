package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila kamar yang
 * ingin didaftarkan sudah ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class RoomSudahAdaException extends Exception{
    private Room room_error;

    /**
     *  Method ini merupakan konstruktor kelas
     *  @param room_input
     */
    public RoomSudahAdaException(Room room_input){
        super("Kamar dengan nomor ruang : \n");
        room_error = room_input;
    }

    /**
     *  Method ini digunakan untuk menampilkan string pesan
     */
    public String getPesan(){
        return super.getMessage() + room_error.getNomorKamar() + " pada " + room_error.getHotel() + " sudah terdaftar.";
    }
}
