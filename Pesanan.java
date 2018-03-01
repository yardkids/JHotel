
/**
 * Class ini digunakan untuk menampilkan/memodelkan suatu
 * bentuk pesanan yang ada baik dalam segi pelanggan yang ada
 * beserta status yang dimiliki, yang dalam hal ini merupakan biaya
 * jenis kamar yang ada, dan juga apakah masih menginap atau tidak
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.01
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    public Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;

    /**
     * Constructor for objects of class Pesanan
     * @param biaya
     * @param pelanggan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }
    
    
    /**
     *  Method ini digunakan untuk menampilkan nama pelanggan yang ada yang sudah diset baik saat pertama kali masuk
     *  ataupun saat mengalami perubaha dengan melakukan setNama
     *  @return nama_pelanggan
     */
    public String getNama(String nama_pelanggan){
        return nama_pelanggan;
    }

    /**
     *  Method ini digunakan untuk melakukan set terhadap nama pelanggan yang ada, sehingga nama dapat diubah,
     *  dan nama yang ada sebelumnya ada akan diubah
     *  @param nama_pelanggan
     */
    public String setNama(String nama_pelanggan){
        this.nama_pelanggan = nama_pelanggan;
        return nama_pelanggan;
    }

    /**
     *  Method ini digunakan untuk menampilkan jumlah biaya yang ada yang sudah diset baik saat pertama kali masuk
     *  ataupun saat mengalami perubaha dengan melakukan setBiaya
     *  @return biaya
     */
    public double getBiaya(){
        return biaya;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan daftar pelanggan yang ada
     *  @return pelanggan
     */
    public Customer getPelanggan(){ 
        return pelanggan;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan bahwa status yang ada saat ini merupakan diproses
     *  @return isDiproses
     */
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan bahwa status yang ada saat ini merupakan telah selesai
     *  @return isSelesai
     */
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah sejumlah biaya yang ada sehingga menjadi biaya yang baru
     *  @param biaya
     */
    public void setBiaya(double Biaya){
        biaya = Biaya;
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah sejumlah pelanggan yang ada menjadi jumlah pelanggan yang terbaru
     *  @param baru
     */
    public void setPelanggan(Customer baru){
        baru = pelanggan;
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah status yang ada menjadi diproses dan kondisi selesai menjadi tidak benar
     *  @param isDiproses
     */
    public void setStatusDiproses(boolean isDiproses){
        this.isDiproses = true;
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah status yang ada menjadi selesai
     *  @param isSelesai
     */
    public void setStatusSelesai(boolean isDiproses){
        this.isSelesai = true;
    }
    
    
    /**
     *  Method ini digunakan untuk mencetak data yang ada
     *  
     */
    public void printData(){
    
    }
}
