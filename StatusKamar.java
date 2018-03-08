
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.08
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String status;
    
    StatusKamar(String stat){
        status = stat;
    }
    
    String getStatus(){
        return status;
    }
}
