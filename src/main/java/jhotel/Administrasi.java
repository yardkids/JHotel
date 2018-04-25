package jhotel;
/**
 * Kelas ini merupakan kelas yang digunakan untuk melakukan segala kegiatan administrasi yang ada di JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
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
    
    /**
     *  Method ini digunakan untuk menampilkan pesanan yang harus diproses, dan mengatur kamar yang dituju
     *  @param pesan, kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);

        //roomAmbilPesanan(pesan,kamar);
    }


    /**
     *  Method ini digunakan untuk menetapkan status ruangan menjadi booked
     *  @param pesan, kamar
     */
    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }*/

    /**
     *  Method ini digunakan untuk menetapkan status ruangan menjadi vacant
     *  @param kamar
     */
    /*
    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }*/

    /**
     *  Method ini digunakan untuk menetapkan bahwa pesanan yang dilakukan, dibatalkan dan mengubah proses menjadi batal
     *  @param kamar
     */
    public static void pesananDibatalkan(Room kamar){
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
        //kamar.setPesanan(pesan);
        kamar.setStatusKamar(StatusKamar.Vacant);
        //roomLepasPesanan(kamar);
    }
    
    /**
     *  Method ini digunakan untuk menyatakan bahwa pesanan yang diminta telah selesai, dan kamar sudah kosong
     *  @param kamar
     */
    public static void pesananSelesai(Room kamar){
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
        //kamar.setPesanan(pesan);
        kamar.setStatusKamar(StatusKamar.Vacant);
        //roomLepasPesanan(kamar);
    }
    
    /**
     *  Method ini digunakan untuk menetapkan bagian pesanan, bahwa pesanan tidak jadi
     *  @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan){
        //roomLepasPesanan(pesan.getRoom());
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    
    /**
     *  Method ini digunakan untuk memberikan ke pesanan bahwa pesanan pada kamar tertentu telah selesai
     *  @param pesan
     */
    public static void pesananSelesai(Pesanan pesan){
        //roomLepasPesanan(pesan.getRoom());
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
}
