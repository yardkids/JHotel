package jhotel.controller;
import org.springframework.web.bind.annotation.*;
import jhotel.*;

import java.util.ArrayList;

@RestController
/**
 * Kelas ini digunakan untuk mengatur terkait Hotel melalui alamat domain
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class HotelController {

    /**
     * Method ini digunakan untuk menampilkan daftar hotel keseluruhan
     * @return HOTEL_DATABASE
     */
    @RequestMapping(value = "/hotel",  method = RequestMethod.GET)
    public ArrayList<Hotel> hotel(){

        ArrayList<Hotel> HOTEL_DATABASE = DatabaseHotel.getHotelDatabase();
        return HOTEL_DATABASE;
    }

    /**
     * Method ini digunakan untuk menampilkan hotel bersarkan dari id yang dimasukkan
     * @param id_hotel
     * @return hotel
     */
    @RequestMapping(value = "/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel){
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }

}
