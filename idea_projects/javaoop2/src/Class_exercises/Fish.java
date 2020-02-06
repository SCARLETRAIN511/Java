package Class_exercises;

public class Fish extends Animal implements Pet{
    private String name;
    protected Fish(String name){
        super(0);
        this.name = name;
    }

    public void eat(){
        System.out.println("Fish is eating");
    }

    public void walk(){
        System.out.println("Swimming");
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void play(){
        System.out.println("fish is playing");
    }

    public static void main(String[] args) {

        Fish fish1 = new Fish("Fuck u");
        System.out.println(fish1.getName());
        fish1.setName("BBibo");
        System.out.println(fish1.name);
        fish1.walk();
        System.out.println(fish1.legs);

    }
}
