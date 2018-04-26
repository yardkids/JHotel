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
        if(pesan!=null&&kamar!=null) {
            if (kamar.getStatusKamar() == StatusKamar.Vacant) {
                pesan.setStatusSelesai(false);
                pesan.setStatusDiproses(true);
                pesan.setRoom(kamar);

                kamar.setStatusKamar(StatusKamar.Booked);
            } else {
                pesan.setStatusAktif(false);
            }
        }

    }

    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
    }

    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
    }


    public static void pesananDibatalkan(Room kamar)
    {

        // kamar.getPesanan().setStatusSelesai(false);
        // tidak bisa dilakukan karena pesan merupakan private object milik class Room



        Pesanan pesanTemp = DatabasePesanan.getPesananAktif(kamar);
        pesanTemp.setStatusSelesai(false);
        pesanTemp.setStatusDiproses(false);
//        pesanTemp.setRoom(null);
        pesanTemp.setStatusAktif(false);

        roomLepasPesanan(kamar);
    }

    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesanTemp = DatabasePesanan.getPesananAktif(kamar);
        pesanTemp.setStatusSelesai(true);
        pesanTemp.setStatusDiproses(false);
//        pesanTemp.setRoom(null);
        pesanTemp.setStatusAktif(false);

        roomLepasPesanan(kamar);
    }

    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
//        pesan.setRoom(null);
    }

    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
//        pesan.setRoom(null);
    }

}
