package jhotel;
import java.util.ArrayList;
/**
 * Kelas ini berisi mengenai Database pesanan yang dilakukan, termasuk
 * mengenai pesanan yang akan dilakukan ataupun menghapus pesanan yang sudah
 * ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Method yang digunakan untuk mengambil keseluruhan database pesanan
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    /**
     *Method yang digunakan untuk mengambil nilai id yang terakhir
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }

    /**
     *  Method ini digunakan untuk melakukan penambahan pesanan kedalam database pesanan
     *  @param baru
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            if (PESANAN_DATABASE.get(i).getStatusAktif()==true&&PESANAN_DATABASE.get(i).getID()==baru.getID()){
                throw new PesananSudahAdaException(baru);
            }
        }
        LAST_PESANAN_ID=baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan pesanan yang ada dari semua data pesanan
     *  @param id
     */
    public static Pesanan getPesanan(int id){
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == id)
            {
                return pesanan;
            }
        }
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil nilai Pesanan yang aktif pada kamar mana saja
     * @param kamar
     */
    public static Pesanan getPesananAktif(Room kamar){
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getRoom().equals(kamar)&&PESANAN_DATABASE.get(i).getStatusAktif()==true){
                return PESANAN_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * Method yang digunakan untuk mengambil nilai pesanan aktif dari pelanggan
     * @param pelanggan
     */
    public static Pesanan getPesananAktif(Customer pelanggan){
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getStatusAktif()==true&&PESANAN_DATABASE.get(i).getPelanggan().equals(pelanggan)){
                    return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }

    /**
     * Method yang digunakan untuk menghapus pesanan yang sudah ada
     * @param cust
     * @throws PesananTidakDitemukanException
     */
    public static boolean removePesanan(Customer cust) throws PesananTidakDitemukanException{
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            if (PESANAN_DATABASE.get(i).equals(cust)){
                if(PESANAN_DATABASE.get(i).getRoom() != null){
                    Administrasi.pesananDibatalkan(PESANAN_DATABASE.get(i));
                }
                else{
                    if(PESANAN_DATABASE.get(i).getStatusAktif()){
                        PESANAN_DATABASE.get(i).setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(PESANAN_DATABASE.get(i))){
                    return true;
                }
            }
        }
        throw new PesananTidakDitemukanException(cust);
    }
}
