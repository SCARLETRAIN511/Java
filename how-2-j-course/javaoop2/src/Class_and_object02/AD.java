package Class_and_object02;

public interface AD {
    public void physicsAttack();

    default public void Attack(){
        System.out.println("It makes an attack");
    }
}
