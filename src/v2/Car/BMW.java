package v2.Car;


public class BMW extends Car {
    public BMW(int a){
        super(a);
    }

    public String name = "BMW";

    public void printBMW(){
        System.out.println("name : " + name);
        System.out.println("this.name : " + this.name);
        System.out.println("super.carName : " + super.carName);  // super : 자식클래스에서 부모클래스의 개체를 가져옴



    }


}
