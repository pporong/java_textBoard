package animal;

public class Cat extends Animal {

    private String gender;

    public Cat(String name, String gender) {
        super(name);
        this.gender = gender;
    }

    @Override
    public void eat() {
        System.out.println(name + " 생선 먹는중~");
    }

    @Override
    public void sleep() {
        System.out.println(name + "가 낮잠을 잡니다.");
    }

    @Override
    public void drink() {
        System.out.println(name + "물을 마십니다.");
    }

    @Override
    public void run(int speed) {
        System.out.println(name + "가 시속 " + speed + "km/h로 달립니다.");
    }

    @Override
    public void hide(String place) {
        System.out.println(name + "가 " + place + "에 숨었습니다.");
    }

    public void catsGender(){
        System.out.println("고양이의 성별은 " + gender + "입니다.");
    }

    public void play(String toy){
        System.out.println(toy + " 을/를 가지고 놉니다.");
    }

}
