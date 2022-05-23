package animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " 개껌 먹는중ㅋㅋ");
    }

    @Override
    void sleep() {
        System.out.println(name + "가 잠을 잡니다.");
    }

    @Override
    void drink() {
        System.out.println(name + "가 물을 마십니다.");
    }

    @Override
    public void run(int speed) {
        System.out.println(name + "가 시속 " + speed + "km/h로 달립니다.");
    }

    @Override
    public void hide(String place) {
        System.out.println(name + "가 " + place + "에 숨었습니다.");
    }
}
