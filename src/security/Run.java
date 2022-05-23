package security;

public class Run {

    public static void main(String[] args) {

        String id = "청솔아파트 3동 2601호";

        // 인스턴스 생성자
        Security security = new Security(id);
        Lighting lighting = new Lighting(id);
        Aircon aircon = new Aircon(id);
        Elevator elevator = new Elevator(id);


        // 부르기
        security.getExistPeople();
        security.on();

        lighting.isOn();
        lighting.on();

        aircon.on();
        aircon.on(18.0);
        aircon.off();

        elevator.callForUp(10);
        elevator.callForDown(4);


    }


}
