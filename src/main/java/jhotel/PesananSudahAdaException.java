package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila pesanan yang
 * dilakukan ternyata sudah ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class PesananSudahAdaException extends Exception {
    private Pesanan pesanan_error;

    /**
     * Method ini merupakan konstruktor dari kelas yang dibuat
     * @param pesanan_input
     */
    public PesananSudahAdaException(Pesanan pesanan_input){
        super("Pesanan yang dipesan oleh : ");
        pesanan_error = pesanan_input;
    }

    /**
     * Method ini digunakan untuk menampilkan string pesan
     *
     */
    public String getPesan(){
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan.";
    }
}
