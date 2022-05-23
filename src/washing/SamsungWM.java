package washing;

// 인터페이스는 다중 상속이 가능하다.
public class SamsungWM implements WashingMachine, DryMachine {

    public int washingSpeed = 0;


    @Override
    public void startButton() {
        if (washingSpeed == 0){
            System.out.println("세탁시간을 설정 해 주세요.");
        } else {
            System.out.println("세탁을 시작했습니다.");
        }

    }

    @Override
    public void pauseButton() {
        if (washingSpeed == 0){
            System.out.println("세탁시간을 설정 해 주세요.");
        } else {
            System.out.println("세탁을 일시 정지했습니다.");
        }
    }

    @Override
    public void stopButton() {
        if (washingSpeed == 0){
            System.out.println("세탁시간을 설정 해 주세요.");
        } else {
            System.out.println("세탁을 종료합니다.");
        }
    }

    @Override
    public int setSpeed(int speed) {

        switch (speed) {
            case 1 : washingSpeed = 20;
                System.out.println("세탁시간이 20분 소요됩니다.");
                break;
            case 2 : washingSpeed = 50;
                System.out.println("세탁시간이 50분 소요됩니다.");
                break;
            case 3 : washingSpeed = 100;
                System.out.println("세탁시간이 100분 소요됩니다.");
                break;
        }

        return washingSpeed;
    }

    public void checkSpeed(){
        if (washingSpeed == 0) {
            System.out.println("세탁시간을 설정 해 주세요.");
        } else {
            System.out.println("설정된 세탁 소요 시간은 " + washingSpeed + "분 입니다.");
        }
    }


    @Override
    public void dry() {
        System.out.println("빨래 건조를 시작합니다.");
    }
}
