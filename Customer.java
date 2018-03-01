
/**
 * Kelas ini digunakan sebagai bentuk untuk memodelkan nama dan id dari
 * customer JHotel yang ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.01
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;

    /**
     * Constructor for objects of class Customer
     * @param id
     * @param nama
     */
    public Customer(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan data ID yang ada
     *  @return id
     */
    public int getID(){
        return id;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan nama yang sudah ditentukan
     *  @return nama
     */
    public String getNama(){
        return nama;
    }
    
    /**
     *  Method ini digunakan untuk mengubah koordinat dari id yang ada
     *  @param id
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     *  Method ini digunakan untuk mengubah koordinat dari nama yang sudah ada
     *  @param nama
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    
    /**
     *  Method ini digunakan untuk mencetak data yang ada
     */
    public void printData(){
    
    }
}
