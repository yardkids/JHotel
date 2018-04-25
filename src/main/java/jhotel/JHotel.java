package jhotel;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Kelas ini digunakan untuk memodelkan JHotel yang menjadi
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
        SpringApplication.run(JHotel.class, args);
    }

}
