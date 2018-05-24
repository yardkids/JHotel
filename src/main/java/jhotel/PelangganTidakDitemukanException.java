package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila pelanggan yang
 * ingin didaftarkan tidak ditemukan
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class PelangganTidakDitemukanException extends Exception {
    private int pelanggan_error;

    /**
     * Method ini merupakan konstruktor dari kelas
     * @param pelanggan_input
     */
    public PelangganTidakDitemukanException(int pelanggan_input){
        super("Data Customer dengan ID : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method ini digunakan untuk menampilkan string pesan
     * @return
     */
    public String getPesan(){
        return super.getMessage() + pelanggan_error + " tidak ditemukan.";

    }
}
