package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila pesanan yang
 * dilakukan ternyata tidak ditemukan
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class PesananTidakDitemukanException extends Exception{
    private Customer pelanggan_error;

    /**
     * Method ini merupakan konstruktor dari kelass yang dibuat
     * @param pelanggan_input
     */
    public PesananTidakDitemukanException(Customer pelanggan_input){
        super("Pesanan yang dipesan oleh : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method ini digunakan untuk menampilkan string pesan
     *
     */
    public String getPesan(){
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.";
    }
}
