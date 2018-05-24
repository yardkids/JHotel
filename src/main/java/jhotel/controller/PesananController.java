package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
/**
 * Kelas ini digunakan untuk mengatur segala yang berhubungan dengan pesanan
 * melalui alamat domain, baik itu melakukan pemesanan, pengecekan, ataupun
 * menyelesaikan dan juga membatalkan pesanan
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class PesananController {

    /**
     * Method ini digunakan untuk melakukan pengecekan customer menggunakan id
     * @param id_customer
     * @return pesan
     */
    @RequestMapping(value = "/pesanancustomer/{id_customer}")
    public Pesanan pesananCust(@PathVariable int id_customer){
        Pesanan pesan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesan;
    }

    /**
     * Method ini digunakan untuk mengecek pesanan berdasarkan pada id pesanan
     * @param id_pesanan
     * @return pesan
     */
    @RequestMapping(value = "/pesanan/{id_pesanan}")
    public Pesanan getPesanan(@PathVariable int id_pesanan){
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        return pesan;
    }

    /**
     * Method ini digunakan untuk melakukan melakukan pemesanan
     * @param jumlah_hari
     * @param id_customer
     * @param id_hotel
     * @param nomor_kamar
     * @return pesanan
     */
    @RequestMapping(value = "/bookpesanan",  method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value = "jumlah_hari") int jumlah_hari, @RequestParam(value = "id_customer") int id_customer,
                               @RequestParam(value = "id_hotel") int id_hotel, @RequestParam(value = "nomor_kamar") String nomor_kamar){

        try{
            DatabasePesanan.addPesanan(new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer)));
        }
        catch(PesananSudahAdaException a){
            a.getPesan();
        }

        Pesanan pesanan = DatabasePesanan.getPesananAktif(
                DatabaseCustomer.getCustomer(id_customer));

        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);

        Administrasi.pesananDitugaskan(pesanan,kamar);
        if(kamar != null)
        {
            pesanan.setBiaya();
        }

        return pesanan;
    }

    /**
     * Method ini digunakan untuk melakukan pembatalan pesanan
     * @param id_pesanan
     * @return pesanan
     */
    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@RequestParam(value="id_pesanan") int id_pesanan)
    {
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        if(pesanan!= null)
        {
            Administrasi.pesananDibatalkan(pesanan);
        }
        return pesanan;
    }

    /**
     * Method ini digunakan untuk menyelesaikan pesanan
     * @param id_pesanan
     * @return pesanan
     */
    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan selesaikanPesanan(@RequestParam(value="id_pesanan") int id_pesanan)
    {
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        if(pesanan!= null)
        {
            Administrasi.pesananSelesai(pesanan);
        }
        return pesanan;
    }

}
