/**
 * Kelas RunForYourLife
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.04.21
 */
public class RunForYourLife implements Runnable{
    private Thread t;
    private String threadName;

    RunForYourLife( String name) {
        threadName = name;
        System.out.println(threadName + ", ready.");
    }

    public void run() {
        System.out.println(threadName  + ", go!");
        try {
            for(int i = 1; i <= 20; i++) {
                Thread.sleep(LetsGo.getRandom(threadName,i-1));
                System.out.println(threadName+" has passed checkpoint "+i);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " has finished!");
    }

    public void start () {
        System.out.println(threadName  + ", set...");
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}