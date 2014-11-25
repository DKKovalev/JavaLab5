import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Train firstTrain = new Train(25348, 30);
        Train secondTrain = new Train(4852, 20);
        Train thirdTrain = new Train(6854, 35);
        Train fourthTrain = new Train(345, 40);
        Train fifthTrain = new Train(21458, 10);
        Train sixthTrain = new Train(985, 70);
        Train seventhTrain = new Train(105, 62);
        Train eighthTrain = new Train(341, 28);
        Train ninthTrain = new Train(2314, 17);

        ArrayList<Train> traffic = new ArrayList<Train>();
        traffic.add(firstTrain);
        traffic.add(secondTrain);
        traffic.add(thirdTrain);
        traffic.add(fourthTrain);
        traffic.add(fifthTrain);
        traffic.add(sixthTrain);
        traffic.add(seventhTrain);
        traffic.add(eighthTrain);
        traffic.add(ninthTrain);
    }
}
