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
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        
    }

    public ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    public int getLastPesananID(){
        return LAST_PESANAN_ID;
    }
    /**
     *  Method ini digunakan untuk melakukan penambahan dari Pesanan yang ada
     *  @param baru
     */
    public static boolean addPesanan(Pesanan baru){
        if (baru.getStatusAktif()==false){
            PESANAN_DATABASE.add(baru);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     *  Method ini digunakan untuk menampilkan pesanan yang ada dari semua data pesanan
     *  @param id
     */
    public static Pesanan getPesanan(int id){
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getID() == id){
                return PESANAN_DATABASE.get(id);
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
            if(PESANAN_DATABASE.get(i).getPelanggan().equals(pelanggan)){
                if(PESANAN_DATABASE.get(i).getStatusAktif()){
                    return PESANAN_DATABASE.get(i);
                }
            }
        }
        return null;
    }

    public static boolean removePesanan(Pesanan pesan){
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        return false;
    }
}
