import java.util.GregorianCalendar;
/**
 * Kelas ini digunakan untuk memodelkan JHotel yang nantinya akan menjadi
 * Class utama untuk menjalankan JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.08
 */
public class JHotel
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JHotel
     */
    public JHotel()
    {
        // initialise instance variables
        
    }
    
    
    /**
     *  Method ini digunakan untuk sebagai method utama dalam menjalankan jhotel
     */
    public static void main(String[] args){
        System.out.print("\u000c");
        Customer cust1 = new Customer("Anggi", 25, 6, 1997, "anggiharumanto@gmail.com");
        cust1.id = 99;
        Customer cust2 = new Customer("Rimuru", 7, 10, 2016, "anggiharumanto@gmail.com");
        cust2.id = 98;
        Customer cust3 = new Customer("Yuuya", 18, 4, 2018, "yuuya@gmail.com");
        cust3.id = 97;

        try {
            DatabaseCustomer.addCustomer(cust1);
            DatabaseCustomer.addCustomer(cust2);
            DatabaseCustomer.addCustomer(cust3);
        }
        catch(PelangganSudahAdaException except){
            System.out.println("-Exception Pelanggan Sudah Ada-");
            System.out.println(except.getPesan());
        }

        try {
            DatabaseCustomer.removeCustomer(97);
            DatabaseCustomer.removeCustomer(99);
        }
        catch(PelangganTidakDitemukanException except){
            System.out.println("\n-Exception Pelanggan Tidak Ditemukan-");
            System.out.println(except.getPesan());
        }

        Lokasi elite = new Lokasi(99, 99, "Super Nyaman");
        Lokasi mewah = new Lokasi(77, 81, "Nyaman");
        Lokasi menengah = new Lokasi(50, 46, "Lumayan");

        Hotel superr = new Hotel("Superb", elite, 10);
        superr.setID(101);
        Hotel debest = new Hotel("Superb", elite, 8);
        Hotel sabi = new Hotel("Sakura", mewah, 9);
        sabi.setID(404);
        Hotel mayan = new Hotel("Vandeu", menengah, 8);

        try{
            DatabaseHotel.addHotel(superr);
            DatabaseHotel.addHotel(debest);
            DatabaseHotel.addHotel(sabi);
            DatabaseHotel.addHotel(mayan);
        }
        catch(HotelSudahAdaException except){
            System.out.println("\n-Exception Hotel Sudah Ada-");
            System.out.println(except.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(404);
        }
        catch(HotelTidakDitemukanException except){
            System.out.println("\n-Exception Hotel Tidak Ditemukan-");
            System.out.println(except.getPesan());
        }

        Room berac = new PremiumRoom(superr, "AH701");
        Room berac2 = new DoubleRoom(superr, "AH701");
        Room luas = new DoubleRoom(superr, "YR401");
        Room sendiri = new SingleRoom(sabi, "Z112");

        try{
            DatabaseRoom.addRoom(berac);
            DatabaseRoom.addRoom(berac2);
            DatabaseRoom.addRoom(luas);
            DatabaseRoom.addRoom(sendiri);
        }
        catch(RoomSudahAdaException except){
            System.out.println("\n-Exception Room Sudah Ada-");
            System.out.println(except.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(sabi, "Z112");
        }
        catch(RoomTidakDitemukanException except){
            System.out.println("\n-Exception Room Tidak Ditemukan-");
            System.out.println(except.getPesan());
        }

        Pesanan pesan1 = new Pesanan(20, cust1);
        pesan1.setId(7);
        Pesanan pesan2 = new Pesanan(11, cust1);
        pesan2.setId(9);
        Pesanan pesan3 = new Pesanan(4, cust2);
        pesan3.setId(18);
        Pesanan pesan4 = new Pesanan(20, cust3);
        pesan4.setId(9);

        try{
            DatabasePesanan.addPesanan(pesan1);
            DatabasePesanan.addPesanan(pesan2);
            DatabasePesanan.addPesanan(pesan3);
            DatabasePesanan.addPesanan(pesan4);
        }
        catch(PesananSudahAdaException except){
            System.out.println("\n-Exception Pesanan Sudah Ada-");
            System.out.println(except.getPesan());
        }
        try{
            DatabasePesanan.removePesanan(cust1);
        }
        catch(PesananTidakDitemukanException except){
            System.out.println("\n-Exception Pesanan Tidak Ditemukan-");
            System.out.println(except.getPesan());
        }

        for (Customer cust : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println("\n" + cust1);
            System.out.println("\n" + cust2);
            System.out.println("\n" + cust3);
        }
        for (Hotel hotel : DatabaseHotel.getHotelDatabase())
        {
            System.out.println(superr);
            System.out.println(debest);
            System.out.println(sabi);
            System.out.println(mayan);
        }
        for (Room pelanggan : DatabaseRoom.getRoomDatabase())
        {
            System.out.println(berac);
            System.out.println(berac2);
            System.out.println(luas);
            System.out.println(sendiri);
        }

        System.out.println("Data PESANAN biasa");
        System.out.println(DatabasePesanan.getPesananDatabase());

        Administrasi.pesananDitugaskan(pesan1, berac);
        Administrasi.pesananDitugaskan(pesan2, berac2);
        Administrasi.pesananDitugaskan(pesan3, luas);
        Administrasi.pesananDitugaskan(pesan4, sendiri);

        System.out.println("Data PESANAN DITUGASKAN");
        System.out.println(DatabasePesanan.getPesananDatabase());

        System.out.println("Data PESANAN SELESAI dan DIBATALKAN");
        Administrasi.pesananSelesai(pesan1);
        Administrasi.pesananSelesai(pesan2);
        Administrasi.pesananDibatalkan(pesan3);
        Administrasi.pesananDibatalkan(pesan4);

        System.out.println(DatabasePesanan.getPesananDatabase());

    }

}
