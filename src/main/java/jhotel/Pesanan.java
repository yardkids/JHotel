package jhotel;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Class ini digunakan untuk memodelkan pesanan yang dilakukan
 * ataupun dibuat
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
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

    /**
     * Method ini digunakan untuk mengambil nilai id
     * @return id
     */
    public int getID(){
        return id;
    }

    /**
     *  Method ini digunakan untuk mengambil nilai biaya
     *  @return biaya
     */
    public double getBiaya(){
        return biaya;
    }

    /**
     *  Method ini digunakan untuk mengambil nilai jumlah hari yang ada
     *  @return jumlahHari
     */
    public double getJumlahHari(){
        return jumlahHari;
    }

    /**
     *  Method ini digunakan untuk mengambil nilai daftar pelanggan yang ada
     *  @return pelanggan
     */
    public Customer getPelanggan(){
        return pelanggan;
    }

    /**
     * Method ini digunakan untuk mengambil nilai status aktif dari pesanan
     * apakah status aktif dalam keadaan true atau false
     * @return isAktif
     */
    public boolean getStatusAktif(){
        return isAktif;
    }

    /**
     *  Method ini digunakan untuk mengambil nilai status di proses apakah true
     *  atau false
     *  @return isDiproses
     */
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    
    /**
     *  Method ini digunakan untuk mengambil nilai status selesai, apakah true
     *  atau false
     *  @return isSelesai
     */
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    
    /**
     *  Method ini digunakan untuk mengambil kamar yang ada
     *  @return kamar
     */
    public Room getRoom(){
        return kamar;
    }
    
    /**
     *  Method ini digunakan untuk mengambil nilai tanggal saat pesanan terjadi
     *  @return tanggalPesan
     */
    public Date getTanggalPesan(){
        return tanggalPesan;
    }

    /**
     * method ini digunakan untuk menentukan nilai id
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     *  Method ini digunakan untuk menentukan sejumlah biaya yang ada sehingga menjadi biaya yang baru
     *
     */
    public void setBiaya(){
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    /**
     *  Method ini digunakan untuk menentukan jumlah hari
     *  @param jumlahHari
     */
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari = jumlahHari;
    }
    
    /**
     *  Method ini digunakan untuk menentukan pelanggan
     *  @param pelanggan
     */
    public void setPelanggan(Customer pelanggan){
        this.pelanggan = pelanggan;
    }

    /**
     * Method ini digunakan untuk menset keadaan status aktif
     * @param aktif
     */
    public void setStatusAktif(boolean aktif){
        isAktif = aktif;
    }

    /**
     *  Method ini digunakan untuk memberikan keadaan status diproses
     *  @param isDiproses
     */
    public void setStatusDiproses(boolean isDiproses){
        this.isDiproses = isDiproses;
    }
    
    /**
     *  Method ini digunakan untuk menentukan keadaan dari status selesai
     *  @param isSelesai
     */
    public void setStatusSelesai(boolean isSelesai){
        this.isSelesai = isSelesai;
    }
    
    /**
     *  Method ini digunakan untuk menentukan kamar
     *  @param 
     */
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }

    /**
     * Method ini digunakan untuk memberikan tanggal pesanan dibuat
     * @param tanggalPesan
     */
    public void setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }

    /**
     * Method ini digunakan untuk menampilkan string kelas Pesanan
     *
     */
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
