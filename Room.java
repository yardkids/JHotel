
/**
 * Kelas ini merupakan gambaran ruangan secara keseluruhan
 *
 * @author Anggi Harumanto
 * @version 2018.03.08
 */
public class Room
{
    // instance variables - replace the example below with your own
    public Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    public Customer customer;
    private double dailyTariff;
    public StatusKamar status_kamar;
    public Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        // initialise instance variables
        
    }
    
    public Hotel getHotel(){
        return hotel;
    }
    
    public int getID(){
        return id;
    }
    
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    public boolean getStatusAvailable(){
        return false;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public StatusKamar getStatusKamar(){
        return status_kamar;
    }
    
    public Pesanan getPesanan(){
        return pesan;
    }
    
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar = nomor_kamar;
    }
    
    public void setStatusAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setDailyTariff(double dailytariff){
        this.dailyTariff = dailytariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar = status_kamar;
    }
    
    public void setPesanan(Pesanan pesan){
        this.pesan = pesan;
    }
    
    public void printData(){
    
    }
}
