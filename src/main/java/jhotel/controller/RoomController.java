package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
/**
 * Kelas ini digunakan untuk mengatur terkait kamar yang ada
 * baik itu pengecekan kamar maupun pendataan terhadap kamar
 * yang kosong
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class RoomController {

    @RequestMapping(value = "/vacantrooms")
    public ArrayList<Room> vacantRooms(){

        return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}")
    public Room getRoom(@PathVariable ("id_hotel") int id_hotel,
                         @PathVariable ("room_no") String nomor_kamar){
        return DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
    }
}
