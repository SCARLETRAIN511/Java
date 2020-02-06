package Class_exercises;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name){
        super(4);
        this.name=name;

    }
    public Cat(){
        this("");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }

    public void play(){
        System.out.println("Cat is playing");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
