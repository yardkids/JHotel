package jhotel;
/**
 * Enumeration class TipeKamar - Untuk mendeskripsikan tipe kamar yang ada pada
 * JHotel
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public enum TipeKamar
{
    Single("Single"), Double("Double "), Premium("Premium");
    private String type;
    
    /**
     *  Method ini digunakan untuk menetapkan status tipe kamar yang digunakan
     *  @param tipe
     */
    TipeKamar(String tipe){
        type = tipe;
    }
    
    /**
     *  Method ini digunakan untuk menyatakan type kamar
     *  @return type
     */
    String getType(){
        return type;
    }
}
