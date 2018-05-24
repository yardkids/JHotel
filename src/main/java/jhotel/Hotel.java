package jhotel;
/**
 * Kelas ini merupakan class yang digunakan untuk memodelkan hotel yang ada
 * baik itu untuk pembuatan awal hotel, hingga pengaturan informasi didalamnya
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

    /**
     * Method ini digunakan untuk mengambil nilai id Hotel
     * @return id
     */
    public int getID(){
        return id;
    }
    
    /**
     *  Method ini digunakan untuk mengambil nilai bintang yang diberikan
     *  @return bintang
     */
    public int getBintang(){
        return bintang;
    }
    
    /**
     *  Method ini digunakan untuk mengambil nama hotel
     *  @return nama
     */
    public String getNama(){
        return nama;
    }
    
    /**
     *  Method ini digunakan untuk mengambil lokasi yang menjadi dasar hotel
     *  @return lokasi
     */
    public Lokasi getLokasi(){
        return lokasi;
    }

    /**
     * Method ini digunakan untuk menetapkan nilai id
     * @param id
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     *  Method ini digunakan untuk menetapkan nama hotel
     *  @param nama
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     *  Method ini digunakan untuk menentukan lokasi yang dijadikan tempat hotel berada
     *  @param lokasi
     */
    public void setLokasi(Lokasi lokasi){
        this.lokasi = lokasi;
    }
    
    /**
     *  Method ini digunakan untuk menentukan nilai bintang
     *  @param bintang
     */
    public void setBintang(int bintang){
        this.bintang = bintang;
    }

    /**
     * Method ini digunakan untuk mencetak string pesan
     *
     */
    public String toString(){
        return "\nHotel" +
                "\nNama Hotel : " + nama +
                "\nLokasi     : " + lokasi.getDeskripsi() +
                "\nBintang    : " +bintang;
    }
}
