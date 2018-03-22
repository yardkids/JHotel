import java.util.Date;

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
    private double jumlahHari;
    public Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    public Room kamar;
    public Date tanggalPesan;

    /**
     * Constructor for objects of class Pesanan
     * @param jumlahHari, pelanggan, kamar, hari, bulan, tahun
     */
    public Pesanan(/*double jumlahHari, Customer pelanggan, Room kamar,
    int hari, int bulan, int tahun*/)
    {
        /*this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff() * jumlahHari;
        this.tanggalPesan = new Date(tahun, bulan, hari);*/
    }
    
    /**
     * Constructor for objects of class Pesanan
     * @param biaya, pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar,
    Date tanggalPesan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff() * jumlahHari;
        this.tanggalPesan = tanggalPesan;
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
     *  Method ini digunakan untuk menampilkan jumlah hari yang ada
     *  @return jumlahHari
     */
    public double getJumlahHari(){
        return jumlahHari;
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
     *  Method ini digunakan untuk menampilkan mengenai kamar
     *  @return kamar
     */
    public Room getRoom(){
        return kamar;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan tanggal saat pesanan terjadi
     *  @param tanggalPesan
     */
    public Date getTanggalPesan(){
        return tanggalPesan;
    }
    
    /**
     *  Method ini digunakan untuk mengubah sejumlah biaya yang ada sehingga menjadi biaya yang baru
     *  @param biaya
     */
    public void setBiaya(){
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    /**
     *  Method ini digunakan untuk mengubah jumlah hari yang sudah ada
     *  @param jumlahHari
     */
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari = jumlahHari;
    }
    
    /**
     *  Method ini digunakan untuk mengubah sejumlah pelanggan yang ada menjadi jumlah pelanggan yang terbaru
     *  @param pelanggan
     */
    public void setPelanggan(Customer pelanggan){
        this.pelanggan = pelanggan;
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
    
    public void setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }
    
    public String toString(){
        String final_status = "Kosong";
        
        if(isDiproses == true && isSelesai == false){
            final_status = "Diproses";
        }
        else if(isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        }
        else if(isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }
        
        return  "\nDibuat oleh " + pelanggan.getNama() +
                " Proses booking untuk " + kamar.getHotel() +
                " Kamar nomor " + kamar.getNomorKamar() +
                " dengan tipe kamar yang diinginkan " + kamar.getTipeKamar() +
                " Status " + final_status + ".";
    }
    
    /**
     *  Method ini digunakan untuk mencetak data yang ada
     *  
     */
    public void printData(){
        //Melakukan print data yang ada
        System.out.println("Nama Pelanggan: " +pelanggan.getNama());
        System.out.println("Status layanan diproses: " +isDiproses);
        System.out.println("Status layanan selesai: " +isSelesai);
        System.out.println("Pencetakan Jumlah Hari: " +jumlahHari);
        System.out.println("Pencetakan Biaya: " +biaya);
    }
}
