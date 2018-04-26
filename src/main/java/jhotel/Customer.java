package jhotel;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Kelas ini digunakan sebagai bentuk untuk memodelkan nama dan id dari
 * customer JHotel yang ada
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;

    /**
     * Constructor for objects of class Customer
     *
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password)
    {
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        this.email = email;
        this.password = password;
        id = DatabaseCustomer.getLastCustomerID()+1;
    }
    
    public Customer(String nama, Date dob, String Email, String password){
        this.nama = nama;
        this.dob = dob;
        this.email = email;
        this.password = password;
        id = DatabaseCustomer.getLastCustomerID()+1;
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
     *  Method ini digunakan untuk menampilkan email yang sudah ditentukan
     *  @return email
     */
    public String getEmail(){
        return email;
    }
    
        /**
     *  Method ini digunakan untuk menampilkan tanggal lahir yang sudah ditentukan
     *  @return dob
     */
    public Date getDOB(){
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String reportDate = df.format(dob);
        System.out.println(reportDate);
        return dob;
    }

    public String getPassword(){
        return password;
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
     *  Method ini digunakan untuk mengubah koordinat dari nama yang sudah ada
     *  @param email
     */
    public void setEmail(String email){
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah koordinat dari nama yang sudah ada
     *  @param dob
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public String toString(){
        if(DatabasePesanan.getPesananAktif(this) != null){
        return "Customer" +
               "\nCustomer ID   : " + id +
               "\nNama          : " + nama +
               "\nEmail         : " + email +
               "\nDate of Birth : " + dob +
               "\nBooking order is in progress";
        }
        
        else{
        return "Customer" +
               "\nNama          : " + nama +
               "\nEmail         : " + email +
               "\nDate of Birth : " + dob;
        }
    }
}
