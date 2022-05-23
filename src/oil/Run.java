package oil;

import oil.AudiA8;
import oil.Car;

public class Run {
    public static void main(String[] args) {

        Car car = new Car(20);
        AudiA8 audiA8 = new AudiA8(20);
        VolvoTruck volvoTruck = new VolvoTruck(50);

        // 얼마 만큼의 기름을 사용하는지
        car.drive(1);  // 6
        audiA8.drive(1);  // 13
        volvoTruck.drive(1);  //

        // 얼마 만큼의 적재가 가능한지
        for(int i = 1; i < 7; i++){
            String box = "박스 " + i ;
            car.store(box);
        }
        car.checkTrunkAmount();
// --------------------------------------------
        for(int i = 1; i < 7; i++){
            String box = "박스 " + i ;
            audiA8.store(box);
        }
        audiA8.checkTrunkAmount();
// --------------------------------------------
        for(int i = 1; i < 71; i++){
            String box = "박스 " + i ;
            volvoTruck.store(box);
        }
        volvoTruck.checkTrunkAmount();

    }




}
