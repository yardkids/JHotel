import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
/**
 * Kelas RunForYourLife
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.04.21
 */

public class LetsGo {
    private static int[] delay = new int[3];
    private static int[][] lamalari = new int[3][20];
    private static int checkpoint=0;

    public static void main(String args[]) {
        Random();
        RunForYourLife R1 = new RunForYourLife( "Messi");
        R1.start();

        RunForYourLife R2 = new RunForYourLife( "Lionel");
        R2.start();

        RunForYourLife R3 = new RunForYourLife( "Andres");
        R3.start();
    }

    public static void Random(){
        while(checkpoint<20){
            for (int x=0;x<3;x++){
                delay[x]=ThreadLocalRandom.current().nextInt(100, 500 + 1);
            }
            Arrays.sort(delay);
            for (int x=0;x<3;x++){
                lamalari[x][checkpoint]=delay[x];
            }
            checkpoint++;
        }

    }

    public static int getRandom(String nama, int id){
        if(nama=="Messi"){
            return lamalari[0][id];
        } else if(nama=="Andres"){
            return lamalari[1][id];
        } else return lamalari[2][id];
    }
}