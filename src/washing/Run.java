package washing;

public class Run {

    public static void main(String[] args) {

        SamsungWM samsungWM = new SamsungWM();

        samsungWM.setSpeed(3);
        samsungWM.startButton();
        samsungWM.pauseButton();
        samsungWM.stopButton();
        samsungWM.checkSpeed();
        samsungWM.dry();

    }

}
