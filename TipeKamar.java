
/**
 * Enumeration class TipeKamar - Untuk mendeskripsikan tipe kamar yang ada pada
 * JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.08
 */
public enum TipeKamar
{
    Single("Single"), Double("Double "), Premium("Premium");
    private String type;
    
    TipeKamar(String tipe){
        type = tipe;
    }
    
    String getType(){
        return type;
    }
}
