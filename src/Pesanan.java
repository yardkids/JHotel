import java.util.Date;
import java.util.GregorianCalendar;

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
    private int id;
    private double biaya;
    private double jumlahHari;
    public Customer pelanggan;
    public boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    public Room kamar;
    public Date tanggalPesan;
    
    /**
     * Constructor for objects of class Pesanan
     * @param jumlahHari, pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        isAktif = true;
        tanggalPesan = new GregorianCalendar().getTime();
        //biaya = kamar.getDailyTariff() * jumlahHari;
        id = DatabasePesanan.getLastPesananID() + 1;
    }

    public int getID(){
        return id;
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

    public boolean getStatusAktif(){
        return isAktif;
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
     *  @return tanggalPesan
     */
    public Date getTanggalPesan(){
        return tanggalPesan;
    }

    public void setId(int id){
        this.id = id;
    }

    /**
     *  Method ini digunakan untuk mengubah sejumlah biaya yang ada sehingga menjadi biaya yang baru
     *
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

    public void setStatusAktif(boolean aktif){
        isAktif = aktif;
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

        if (kamar!=null) {
            return "\n\nDibuat oleh : " + pelanggan.getNama() +
                    "\nProses booking untuk " +kamar.getHotel() +
                    "\nKamar nomor " +kamar.getNomorKamar() +
                    " dengan tipe kamar yang diinginkan " + kamar.getTipeKamar() +
                    "\nStatus : " +final_status;
        }
        return "\nDibuat oleh : " + pelanggan.getNama() +
                "\nStatus : " +final_status;
    }
}
