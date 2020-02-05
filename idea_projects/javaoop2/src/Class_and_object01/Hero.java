package Class_and_object01;

public class Hero {
    protected String name;
    float hp;
    float armor;
    int moveSpeed;

    //初始化属性
    float maxHp = 100f;
    float minHp;
    public Hero(){
        hp=20;
    }
    private static String CopyRight;//类属性

    {
        minHp = 122.3f;
    }
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
    public void kill(Mortal m){
        System.out.println(name + "This hero use the skill");
        m.die();
    }

    public void Shout(){
        System.out.println("this is the method of the parent class");
    }

    public void SetName(String name){
        this.name = name;
    }

    public static void Win() {//有static, 表示类自身的方法
        System.out.println("Battle win");
    }//类方法；

    public static void main(String[] args) {
        Hero Garen = new Hero("Garen no1",12f);
        System.out.println(Garen.name);
        Garen.SetName("Garen again");
        System.out.println(Garen.name);
        Garen.CopyRight = "拳头公司";
        Hero Timo = new Hero("Timmo",12f);//新构造方法初始化属性
        System.out.println(Timo.hp);
        Hero.Win();

        ADHero Tii = new ADHero();
        Tii.name = "Timmo";
        Garen.kill(Tii);
        ADHero AD1 = new ADHero();
        Garen.Win();
        AD1.Win();
        ADHero.Win();
    }
}
