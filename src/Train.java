import java.util.concurrent.Semaphore;

public class Train {
    private int id;
    private int numberOfCars;
    public Semaphore canPass;

    public Train(int id, int numberOfCars) {
        this.id = id;
        this.numberOfCars = numberOfCars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Semaphore getCanPass() {
        return canPass;
    }

    public void setCanPass(Semaphore canPass) {
        this.canPass = canPass;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }
}
