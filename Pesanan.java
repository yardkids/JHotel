
/**
 * Class ini digunakan untuk menampilkan/memodelkan suatu
 * bentuk pesanan yang ada baik dalam segi pelanggan yang ada
 * beserta status yang dimiliki, yang dalam hal ini merupakan biaya
 * jenis kamar yang ada, dan juga apakah masih menginap atau tidak
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    public Customer pelanggan;
    private String nama_pelanggan;
    public TipeKamar tipe_kamar;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    public Room kamar;

    /**
     * Constructor for objects of class Pesanan
     * @param biaya, pelanggan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
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
     *  Method ini digunakan untuk menampilkan tipe kamar yang digunakan
     *  @return tipe_kamar
     */
    public TipeKamar getTipeKamar(){
        return tipe_kamar;
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
     *  Method ini digunakan untuk menampilkan mengenai kamar
     *  @return kamar
     */
    public Room getRoom(){
        return kamar;
    }
    
    /**
     *  Method ini digunakan untuk mengubah sejumlah biaya yang ada sehingga menjadi biaya yang baru
     *  @param biaya
     */
    public void setBiaya(double Biaya){
        this.biaya = Biaya;
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah sejumlah pelanggan yang ada menjadi jumlah pelanggan yang terbaru
     *  @param pelanggan
     */
    public void setPelanggan(Customer pelanggan){
        this.pelanggan = pelanggan;
    }
    
    /**
     *  Method ini digunakan untuk mengubah/menambah nama pelanggan
     *  @param nama_pelanggan
     */
    public void setNamaPelanggan(String nama_pelanggan){
        this.nama_pelanggan = nama_pelanggan;
    }
    
    /**
     *  Method ini digunakan untuk mengubah/menambah/mengatur tipe kamar yang digunakan
     *  @param tipe_kamar
     */
    public void setTipeKamar(TipeKamar tipe_kamar){
        this.tipe_kamar = tipe_kamar;
    }
    
    /**
     *  Method ini digunakan untuk mengubah status yang ada menjadi diproses dan kondisi selesai menjadi tidak benar
     *  @param isDiproses
     */
    public void setStatusDiproses(boolean isDiproses){
        this.isDiproses = isDiproses;
    }
    
    /**
     *  Method ini digunakan untuk mengubah status yang ada menjadi selesai
     *  @param isSelesai
     */
    public void setStatusSelesai(boolean isSelesai){
        this.isSelesai = isSelesai;
    }
    
    
    /**
     *  Method ini digunakan untuk mengubah status yang ada menjadi selesai
     *  @param 
     */
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    
    /**
     *  Method ini digunakan untuk mencetak data yang ada
     *  
     */
    public void printData(){
        //Melakukan print data yang ada
        System.out.println("Nama Pelanggan: " +pelanggan.getNama());
        System.out.println("Tipe Kamar: " +tipe_kamar);
        System.out.println("Status layanan diproses: " +isDiproses);
        System.out.println("Status layanan selesai: " +isSelesai);
    }
}
