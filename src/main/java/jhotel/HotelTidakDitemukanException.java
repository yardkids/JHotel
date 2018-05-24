package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila hotel yang
 * yang ingin dihapus tidak dapat ditemukan
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;

    /**
     * Method ini merupakan konstruktor dari kelas
     * @param hotel_input
     */
    public HotelTidakDitemukanException(int hotel_input){
        super("Hotel dengan ID : ");
        hotel_error = hotel_input;
    }

    /**
     * Method ini digunakan untuk mencetak pesan
     *
     */
    public String getPesan(){
        return super.getMessage() + hotel_error + " tidak ditemukan.";
    }
}
