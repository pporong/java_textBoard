package animal;

public class Run {

    public static void main(String[] args) {
        Dog puppy = new Dog("퍼피");
        puppy.run(10);
        puppy.hide("개집");
        puppy.drink();
        puppy.eat();
        puppy.sleep();
        System.out.println("나의 이름은 " + puppy.name + "다멍!");


        System.out.println();

        Cat cat = new Cat("나비","수컷");
        cat.catsGender();
        cat.run(20);
        cat.hide("박스");
        cat.play("고등어인형");
        cat.drink();
        cat.eat();
        cat.sleep();
        System.out.println("나의 이름은 " + cat.name + "다냥!");


    }

}
