
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.10
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String status;
    
    /**
     *  Method ini digunakan untuk menetapkan status ruangan
     *  @param stat
     */
    StatusKamar(String stat){
        status = stat;
    }
    
    /**
     *  Method ini digunakan untuk menyatakan status ruangan yang ada
     *  @return status
     */
    String getStatus(){
        return status;
    }
}
