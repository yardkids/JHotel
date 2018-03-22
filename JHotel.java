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
        Customer cust1 = new Customer(19, "Rimuru", new GregorianCalendar(2018,06,25).getTime());
        
        
        /* System.out.print("\u000c");
        Lokasi lokasi = new Lokasi(99, 99, "Elite");
        Hotel hotel = new Hotel("Tempest", lokasi, 5);
        Room room = new PremiumRoom(hotel, "SD701", true, StatusKamar.Booked);
        room.setDailyTariff(900000);
        //Customer customer = new Customer(18, "Rimuru");
        //Pesanan pesan = new Pesanan(30, customer, room);
        
        System.out.println("\n\t\t\tSelamat datang di JHotel\n");
        lokasi.printData();
        //customer.printData();
        hotel.printData();
        
        System.out.println("\n\t=======================Method 1=======================");
        //Administrasi.pesananDitugaskan(pesan, room);
        room.printData();
        //pesan.printData();
        
        if(room instanceof DoubleRoom){
            System.out.print("\nBenar DoubleRoom\n");
        }
        
        else{
            System.out.print("\nSalah, bukan DoubleRoom\n");
        }
        
        Lokasi lokasi2 = new Lokasi(101, 101, "Supreme");
        Hotel hotel2 = new Hotel("Iona", lokasi2, 5);
        Room room2 = new DoubleRoom(hotel2, "I401", true, StatusKamar.Booked);
        room2.setDailyTariff(1000000);
        //Customer customer2 = new Customer(21, "Yuuya");
        //Pesanan pesan2 = new Pesanan(24, customer2, room2);
        
        System.out.println("\n\n\t\t\tSelamat datang di JHotel\n");
        lokasi2.printData();
        //customer2.printData();
        hotel2.printData();        
        
        System.out.println("\n\t=======================Method 1=======================");
        //Administrasi.pesananDitugaskan(pesan2, room2);
        room2.printData();
        //pesan2.printData();
        
        if(room2 instanceof DoubleRoom){
            System.out.print("\nBenar DoubleRoom\n");
        }
        
        else{
            System.out.print("\nSalah, bukan DoubleRoom\n");
        }
        
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
