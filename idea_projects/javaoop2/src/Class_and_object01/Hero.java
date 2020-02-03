package Class_and_object01;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    //初始化属性
    float maxHp = 100f;
    float minHp;
    {
        minHp = 122.3f;
    }
    public Hero(){
        hp=20;
    }

    static String CopyRight;//类属性
    private void showAddressInMemory() {
        System.out.println("print the \'this\''s address: " + this);
    }
    public Hero(String Name){
        this.name = name;
    }

    public Hero(String name, float Hp){
        this.name = name;
        this.hp = Hp;
    }

    public void SetName(String name){
        this.name = name;
    }

    public static void Win() {
        System.out.println("Battle win");
    }//类方法；

    public static void main(String[] args) {
        Hero Garen = new Hero("Garen no1",12f);
        System.out.println(Garen.name);
        Garen.SetName("The secondName");
        System.out.println(Garen.name);
        Garen.CopyRight = "拳头公司";
        Hero Timo = new Hero("Timmo",12f);
        System.out.println(Timo.hp);
        Hero.Win();
    }

}
