
/**
 * Kelas ini merupakan gambaran ruangan secara keseluruhan
 *
 * @author Anggi Harumanto -1506673744
 * @version 2018.03.10
 */
public class Room
{
    // instance variables - replace the example below with your own
    public Hotel hotel;
    private int id;
    private String nomor_kamar;
    private  boolean isAvailable;
    public Customer customer;
    private double dailyTariff;
    public StatusKamar status_kamar;
    public Pesanan pesan;

    /**
     * Constructor for objects of class Room
     * @param hotel, nomor_kamar, isAvailable, customer, dailytariff, status_kamar
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable,
    Customer customer, double dailytariff, StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.customer = customer;
        this.dailyTariff = dailytariff;
        this.status_kamar = status_kamar;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan hotel yang ada saat ini
     *  @return hotel
     */
    public Hotel getHotel(){
        return hotel;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan ID dari hotel
     *  @return id
     */
    public int getID(){
        return id;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan nomor kamar yang ada
     *  @return nomor_kamar
     */
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan status yang ada, apakah tersedia atau tidak
     *  
     */
    public boolean getStatusAvailable(){
        return false;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan mengenai customer
     *  @return customer
     */
    public Customer getCustomer(){
        return customer;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan status kamar saat ini, apakah booked, processed atau kosong
     *  @return status_kamar
     */
    public StatusKamar getStatusKamar(){
        return status_kamar;
    }
    
    /**
     *  Method ini digunakan untuk mengambil data pesanan
     *  @return pesan
     */
    public Pesanan getPesanan(){
        return pesan;
    }
    
    /**
     *  Method ini digunakan untuk mengubah/menambah hotel yang ada
     *  @param hotel
     */
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    
    /**
     *  Method ini digunakan untuk mengubah/mengganti id dari hotel
     *  @param id
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     *  Method ini digunakan untuk mengubah atau mengganti nomor_kamar
     *  @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar = nomor_kamar;
    }
    
    /**
     *  Method ini digunakan untuk mengganti status kamar yang ingin ditempati, baik menjadi true ataupun false
     *  @param isAvailable
     */
    public void setStatusAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    /**
     *  Method ini digunakan untuk mengubah data customer
     *  @param customer
     */
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    /**
     *  Method ini digunakan untuk mengubah tarif yang dimasukkan
     *  @param dailytariff
     */
    public void setDailyTariff(double dailytariff){
        this.dailyTariff = dailytariff;
    }
    
    /**
     *  Method ini digunakan untuk mengubah status kamar yang ada, mungkin menjadi booked, processed atau vacant
     *  @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar = status_kamar;
    }
    
    /**
     *  Method ini digunakan untuk mengubah mengenai data pesanan
     *  @param pesan
     */
    public void setPesanan(Pesanan pesan){
        this.pesan = pesan;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan/print data dari yang ingin ditampilkan
     *  
     */
    public void printData(){
        System.out.println("Nama Hotel  : " +hotel.getNama());
        System.out.println("Nomor Kamar : " +nomor_kamar);
        System.out.println("Tersedia    : " +isAvailable);
        System.out.println("Pelanggan   : " +customer.getNama());
        System.out.println("Harga       : " +dailyTariff);
        System.out.println("Status Kamar: " +status_kamar);
    }
}
