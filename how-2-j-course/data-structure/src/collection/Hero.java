package collection;

public class Hero implements LOL{
    String name;
    float hp;
    int damage;
    public Hero(){

    }
    public Hero(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}
