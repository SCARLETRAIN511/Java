package Class_exercises;

public class Spider extends Animal{
    private String name;
    public void eat(){
        System.out.println("Spider is eating");
    }
    public Spider(String name){
        super(8);
        this.name=name;
    }
}
