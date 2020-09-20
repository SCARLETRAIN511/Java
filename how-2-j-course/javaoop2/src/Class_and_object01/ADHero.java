package Class_and_object01;

public class ADHero extends Hero implements AD, Mortal{

    public void physicsAttack(){
        System.out.println("This is system attack");
    }

    public void die(){System.out.println(name + " is dead now");
    }//重写是子类覆盖父类的对象方法

    public static void Win(){
        System.out.println("Adhero battle win");
    }
    //隐藏是子类覆盖父类的类方法

    public void Shout(){
        super.Shout();
    }//使用super调用父类方法


    public static void main(String[] args) {
        ADHero ABC = new ADHero();
        ABC.physicsAttack();
        System.out.println(ABC instanceof AD);//ADHero/Hero
        ABC.Win();
        ADHero TT = new ADHero();
        ABC.Shout();
    }

}
