package Class_and_object01;

//懒汉
public class GiantDragon2 {
    private GiantDragon2() {

    }
    private static GiantDragon2 instance;
    public static GiantDragon2 getInstance(){
        if (null == instance){
            instance = new GiantDragon2();
        }
        return instance;
    }
}
