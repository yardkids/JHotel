package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila hotel yang
 * akan dibuat sudah ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class HotelSudahAdaException extends Exception {
    private Hotel hotel_error;

    /**
     * Method ini merupakan konstruktor dari kelas
     * @param hotel_input
     */
    public HotelSudahAdaException(Hotel hotel_input){
        super("Hotel dengan nama : ");
        hotel_error = hotel_input;
    }

    /**
     * Method ini digunakan untuk mencetak pesan
     *
     */
    public String getPesan(){
        return super.getMessage() + hotel_error.getNama() + " sudah terdaftar.";
    }
}
