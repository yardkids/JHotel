
/**
 * Kelas ini digunakan untuk mendeskripsikan mengenai lokasi atau lebih tepatnya koordinat dari sumbu x dan y
 * beserta dengan deskripsi singkat mengenai lokasi yang dibuat
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.03.08
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
     *  Method ini digunakan untuk menampilkan koordinat x yang sudah ada
     *  @return x_coord
     */
    public float getX(){
        return x_coord;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan koordinat y yang sudah ada
     *  @return y_coord
     */
    public float getY(){
        return y_coord;
    }
    
    /**
     *  Method ini digunakan untuk menampilkan deskripsi lokasi yang sudah ditentukan
     *  @return deskripsiLokasi
     */
    public String getDeskripsi(){
        return deskripsiLokasi;
    }
    
    /**
     *  Method ini digunakan untuk mengubah koordinat dari nilai x
     *  @param x_coord
     */
    public void setX(float x_coord){
        this.x_coord = x_coord;
    }
    
    /**
     *  Method ini digunakan untuk mengubah koordinat dari nilai y
     *  @param y_coord
     */
    public void setY(float y_coord){
        this.y_coord = y_coord;
    }
    
    /**
     *  Method ini digunakan untuk mengubah koordinat dari nilai deskripsi lokasi
     *  @param deskripsiLokasi
     */
    public void setDeskripsi(String deskripsi){
        deskripsiLokasi = deskripsi;
    }
    
    /**
     *  Method ini digunakan untuk mencetak data yang ada
     */
    public void printData(){
        //Melakukan print pada Deskripsi Lokasinya
        System.out.println("Deskripsi Lokasi:" +deskripsiLokasi);
    }
}
