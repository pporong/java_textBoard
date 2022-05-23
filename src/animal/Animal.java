package animal;

public abstract class Animal {

    public String name;
    public Animal(String name){
        this.name = name;
    }


    abstract void eat();
    abstract void sleep();
    abstract void drink();

    public void run(int speed){};
    public void hide(String place){};



}
