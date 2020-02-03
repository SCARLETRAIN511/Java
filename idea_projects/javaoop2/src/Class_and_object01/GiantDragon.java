package Class_and_object01;

//饿汉
public class GiantDragon {
    private GiantDragon() {
    }
    private static GiantDragon instance = new GiantDragon();
    public static GiantDragon getInstance(){
        return instance;
    }
}
