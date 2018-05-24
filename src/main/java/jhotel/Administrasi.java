package jhotel;
/**
 * Kelas ini merupakan kelas yang digunakan untuk melakukan segala kegiatan administrasi yang ada di JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
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
     *  Method ini digunakan untuk mengambil nilai pesanan yang harus diproses, dan mengatur kamar yang dituju
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

    /**
     * Method ini digunakan untuk melakukan pengambilan pesan
     * @param pesan
     * @param kamar
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
    }

    /**
     * Method ini digunakan untuk melepaskan kamar
     * @param kamar
     */
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
    }

    /**
     * Method ini digunakan untuk melakukan pembatalan pesanan
     * @param kamar
     */
    public static void pesananDibatalkan(Room kamar)
    {

        Pesanan pesanTemp = DatabasePesanan.getPesananAktif(kamar);
        pesanTemp.setStatusSelesai(false);
        pesanTemp.setStatusDiproses(false);
//        pesanTemp.setRoom(null);
        pesanTemp.setStatusAktif(false);

        roomLepasPesanan(kamar);
    }

    /**
     * Method ini digunakan untuk menentukan dari pesanan selesai
     * @param kamar
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesanTemp = DatabasePesanan.getPesananAktif(kamar);
        pesanTemp.setStatusSelesai(true);
        pesanTemp.setStatusDiproses(false);
//        pesanTemp.setRoom(null);
        pesanTemp.setStatusAktif(false);

        roomLepasPesanan(kamar);
    }

    /**
     * Method ini digunakan untuk melakukan pembatan pesan
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
//        pesan.setRoom(null);
    }

    /**
     * Method ini digunakan untuk melakukan penentuan Low Bandwidth
     * @param pesan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
//        pesan.setRoom(null);
    }

}
