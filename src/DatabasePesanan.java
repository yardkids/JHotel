import java.util.ArrayList;
/**
 * Kelas ini berisi mengenai Database pesanan yang dilakukan, termasuk
 * mengenai pesanan yang akan dilakukan ataupun menghapus pesanan yang sudah
 * ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }
    /**
     *  Method ini digunakan untuk melakukan penambahan dari Pesanan yang ada
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
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getID() == id){
                return PESANAN_DATABASE.get(i);
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar){
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getRoom() == kamar){
                return PESANAN_DATABASE.get(i);
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan){
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getStatusAktif()==true&&PESANAN_DATABASE.get(i).getPelanggan().equals(pelanggan)){
                    return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }

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
