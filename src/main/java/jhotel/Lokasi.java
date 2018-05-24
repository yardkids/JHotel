package jhotel;
/**
 * Kelas ini digunakan untuk mendeskripsikan mengenai lokasi atau lebih tepatnya koordinat dari sumbu x dan y
 * beserta dengan deskripsi singkat mengenai lokasi yang dibuat
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    /**
     * Constructor for objects of class Lokasi
     * @param x_coord
     * @param y_coord
     * @param deskripsiLokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    
    /**
     *  Method ini digunakan untuk mengambil nilai koordinat x yang sudah ada
     *  @return x_coord
     */
    public float getX(){
        return x_coord;
    }
    
    /**
     *  Method ini digunakan untuk mengambil nilai koordinat y yang sudah ada
     *  @return y_coord
     */
    public float getY(){
        return y_coord;
    }
    
    /**
     *  Method ini digunakan untuk mengambil deskrip dari lokasi
     *  @return deskripsiLokasi
     */
    public String getDeskripsi(){
        return deskripsiLokasi;
    }
    
    /**
     *  Method ini digunakan untuk menentukan koordinat dari nilai x
     *  @param x_coord
     */
    public void setX(float x_coord){
        this.x_coord = x_coord;
    }
    
    /**
     *  Method ini digunakan untuk menentukan koordinat dari nilai y
     *  @param y_coord
     */
    public void setY(float y_coord){
        this.y_coord = y_coord;
    }
    
    /**
     *  Method ini digunakan untuk menentukan deskripsi lokasi hotel
     *  @param deskripsi
     */
    public void setDeskripsi(String deskripsi){
        deskripsiLokasi = deskripsi;
    }

    /**
     * Method ini digunakan untuk mencetak pesan kelas Lokasi
     *
     */
    public String toString(){
        return "\nLokasi" +
                "\nKoordinat X:" + x_coord +
                "\nKoordinat Y:" + y_coord +
                "\nDeskripsi Lokasi:" +deskripsiLokasi;
    }
}
