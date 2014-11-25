import java.util.ArrayList;

public class Tunnel extends Thread {
    private String threadName;
    ArrayList<Train> trains;

    public Tunnel(String threadName, ArrayList<Train> trains) {
        this.threadName = threadName;
        this.trains = trains;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(threadName + " started.");
        try {
            for (int i = 0; i < trains.size(); i++) {
                trains.get(i).canPass.acquire();
            }

            System.out.println(threadName + " entered the tunnel.");

            for (int i = 0; i < trains.size(); i++) {
                sleep(trains.get(i).getNumberOfCars());
            }

            System.out.println(threadName + " passed the tunnel.");

            for (int i = 0; i< trains.size(); i++){
                trains.get(i).canPass.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
