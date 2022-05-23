package security;

public class Aircon implements OnOff{

    // 필드 생성
    public String id;
    public double temp = 26.0;

    // 인스턴스 생성자
    public Aircon(String id){
        this.id = id;
    }

    @Override
    public boolean on() {
        System.out.println(id + "에어컨이 켜졌습니다. 온도는 " + temp + "도 입니다.");
        return true;
    }

    // 오버로드
    public boolean on(double changeTemp){
       this.temp = changeTemp;
       this.on();
       return true;
    }

    @Override
    public boolean off() {
        System.out.println(id + "에어컨이 꺼졌습니다.");
        return false;
    }
}
