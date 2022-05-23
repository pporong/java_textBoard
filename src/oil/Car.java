package oil;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private int oilTank;
    private int efficiency = 5;
    private int maxScoreAmount = 5;
    private int speed = 1;
    private List<String> trunk = new ArrayList<>();


    public Car(int oilTank){
        if (oilTank < 1){
            oilTank = 0;
        }
        this.oilTank = oilTank;
    }

    public void checkTrunkAmount(){
        if (this.trunk.size() < 10){
            System.out.println(trunk.toString());
        } else {
            System.out.println(trunk.size() + "개의 짐이 적재되어 있습니다.");
        }

    }

    // 트렁크 적재량을 바꾸기 위한 메서드
    protected void setMaxScoreAmount(int maxScoreAmount){
        if (maxScoreAmount > 5){
            this.maxScoreAmount = maxScoreAmount;
            this.efficiency = maxScoreAmount + 1;
        } else {
            this.maxScoreAmount = 5;
        }
    }

    // speed 재정의
    protected  void setSpeed(int speed){
        if (speed > 1){
            this.speed = speed;
        }
    }

    // 운전 기능
    public void drive(int distance){
        if (checkOilTank(distance)){
            oilTank = oilTank - ((distance * efficiency) + speed);
            System.out.println("앞으로 갑니당.");
            System.out.println("남은 기름량 : " + this.oilTank);
        } else {
            System.out.println("기름이 부족합니다!");
        }
    }

    // 기름량 검사
    private boolean checkOilTank(int distance){
        // 기름량 = (거리 * 효율) + 속도
        if (oilTank > ( (distance * efficiency) + speed) ){
            return true;
        } else {
            return false;
        }
    }

    // 트렁크에 물건 싣기
    public void store(String goods){
        if (checkTrunk()){
            this.trunk.add(goods);
        } else {
            System.out.println("트렁크가 가득 차서 물건을 실을 수 없습니다.");
        }
    }

    // 트렁크 적재량 검사
    private boolean checkTrunk(){
        if(trunk.size() < maxScoreAmount){
            return true;
        } else {
            return false;
        }
    }


}
