
/**
 * Kelas ini merupakan kelas yang digunakan untuk melakukan segala kegiatan administrasi yang ada di JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.08
 */
public class Administrasi
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }
    
    public static void pesananDitugaskan(Pesanan pesan, Room kamar){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        
        roomAmbilPesanan(pesan,kamar);
    }
    
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    
    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesanTemp = kamar.getPesanan();
        pesanTemp.setStatusSelesai(false);
        pesanTemp.setStatusDiproses(false);
        pesanTemp.setRoom(null);
        kamar.setPesanan(pesanTemp);
        
        roomLepasPesanan(kamar);
    }
    
    public static void pesananSelesai(Room kamar){
        Pesanan pesanTemp = kamar.getPesanan();
        pesanTemp.setStatusSelesai(true);
        pesanTemp.setStatusDiproses(false);
        pesanTemp.setRoom(null);
        kamar.setPesanan(pesanTemp);
        
        roomLepasPesanan(kamar);
        
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Pesanan pesan){
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
