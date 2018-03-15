
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
        Lokasi lokasi = new Lokasi(99, 99, "Elite");
        Hotel hotel = new Hotel("Tempest", lokasi, 5);
        SingleRoom room = new SingleRoom(hotel, "SD701", true, StatusKamar.Processed);
        Customer customer = new Customer(18, "Rimuru");
        Pesanan pesan = new Pesanan(30, customer, room);
        
        System.out.println("\t\t\tSelamat datang di JHotel\n");
        lokasi.printData();
        customer.printData();
        hotel.printData();
        
        System.out.println("\n\t=======================Method 1=======================");
        Administrasi.pesananDitugaskan(pesan, room);
        room.printData();
        pesan.printData();
        
        System.out.print("\n\nSalah, bukan DoubleRoom ->");
        System.out.print(room instanceof SingleRoom);
        
        Lokasi lokasi2 = new Lokasi(99, 99, "Elite");
        Hotel hotel2 = new Hotel("Tempest", lokasi2, 5);
        DoubleRoom room2 = new DoubleRoom(hotel2, "SD701", true, StatusKamar.Processed);
        Customer customer2 = new Customer(18, "Rimuru");
        Pesanan pesan2 = new Pesanan(30, customer, room2);
        
        System.out.println("\t\t\tSelamat datang di JHotel\n");
        lokasi.printData();
        customer.printData();
        hotel.printData();
        
        System.out.println("\n\t=======================Method 1=======================");
        Administrasi.pesananDitugaskan(pesan, room2);
        room.printData();
        pesan.printData();
        
        System.out.print("\n\nBenar DoubleRoom ->");
        System.out.print(room2 instanceof DoubleRoom);
        
        /*
        System.out.println("\n\t=======================Method 2=======================");
        Administrasi.pesananDibatalkan(room);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n\t=======================Method 3=======================");
        Administrasi.pesananDibatalkan(pesan);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n\t=======================Method 4=======================");
        Administrasi.pesananSelesai(room);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n\t=======================Method 5=======================");
        Administrasi.pesananSelesai(pesan);
        room.printData();
        pesan.printData();
        */
        
    
    }

}
