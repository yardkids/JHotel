
/**
 * Kelas ini merupakan class yang digunakan untuk memperlihatkan nama dari hotel yang ada beserta popularitasnya
 * dan juga lokasi dari hotel yang ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class Hotel
{
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    /**
     * Constructor for objects of class Hotel
     * @param nama
     * @param lokasi
     * @param bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        id = DatabaseHotel.getLastHotelID()+1;
    }

    public int getID(){
        return id;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan bintang yang diperoleh oleh suatu hotel
     *  @return bintang
     */
    public int getBintang(){
        return bintang;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan nama dari hotel yang ada
     *  @return nama
     */
    public String getNama(){
        return nama;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan lokasi dari hotel yang ada
     *  @return lokasi
     */
    public Lokasi getLokasi(){
        return lokasi;
    }

    public void setID(int id){
        this.id = id;
    }
    
    /**
     *  Method ini digunakan untuk mengganti atau mengubah nama dari hotel yang ada
     *  @param nama
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     *  Method ini digunakan untuk mengubah atau mengganti dari lokasi yang ada
     *  @param lokasi
     */
    public void setLokasi(Lokasi lokasi){
        this.lokasi = lokasi;
    }
    
    /**
     *  Method ini digunakan untuk mengganti bintang yang sudah ada menjadi yang baru
     *  @param bintang
     */
    public void setBintang(int bintang){
        this.bintang = bintang;
    }
    
    public String toString(){
        return "\nHotel" +
                "\nNama Hotel : " + nama +
                "\nLokasi     : " + lokasi.getDeskripsi() +
                "\nBintang    : " +bintang;
    }
}
