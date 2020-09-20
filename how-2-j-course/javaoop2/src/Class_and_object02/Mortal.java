package Class_and_object02;

public interface Mortal {
    public void die();

    default public void revive(){
        System.out.println("It revives");
    }
}
