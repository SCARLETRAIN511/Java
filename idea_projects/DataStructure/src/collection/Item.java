package collection;

public class Item implements LOL{
    String name;
    int price;
    public Item(String name){
        this.name = name;
    }
    public void effect(){
        System.out.println("It has effect");
    }
    public boolean disposable(){
        return false;
    }
    public String toString(){
        return name;
    }
}
