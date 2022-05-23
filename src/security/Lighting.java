package security;

import java.util.Random;

public class Lighting implements OnOff{

    public String id;

    // 인스턴스 생성자
    public Lighting(String id){
        this.id = id;
    }


    @Override
    public boolean on() {
        System.out.println(id + "님이 불을 켰습니다.");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println(id + "님이 불을 껐습니다.");
        return false;
    }

    public boolean isOn(){

        // 인스턴스 생성
        Random random = new Random();
        boolean check = random.nextBoolean();
        System.out.println(check);
        return check;
    }


}
