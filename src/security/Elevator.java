package security;

public class Elevator {

    public String id;

    public Elevator(String id){
        this.id = id;
    }

    public boolean callForUp(int stopFloor){
        System.out.println(id + " -> 엘레베이터가 " + stopFloor + "층으로 올라갑니다.");
        return true;
    }

    public boolean callForDown(int stopFloor){
        System.out.println(id + " -> 엘레베이터가 " + stopFloor + "층으로 내려갑니다.");
        return false;
    }





}
