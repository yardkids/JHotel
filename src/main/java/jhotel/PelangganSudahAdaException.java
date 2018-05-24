package jhotel;

/**
 * Kelas ini digunakan untuk mengatur exception apabila pelanggan yang
 * akan dimasukkan sudah ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class PelangganSudahAdaException extends Exception {
    private Customer pelanggan_error;

    /**
     * Method ini merupakan konstruktor dari kelas
     * @param pelanggan_input
     */
    public PelangganSudahAdaException(Customer pelanggan_input){
        super("Pelanggan dengan data : \n");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method ini digunakan untuk mencetak pesan
     * @return
     */
    public String getPesan(){
        return super.getMessage() + pelanggan_error + " sudah terdaftar.";
    }
}
