package Class_and_object02;

public class ADHero extends Hero implements AD{
    public void physicsAttack(){
        System.out.println("Doing a physical attack");
    }//使用接口

    public void attack(){
        physicsAttack();
    }//抽象类

}
