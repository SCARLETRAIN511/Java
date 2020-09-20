package class01;

public class Hero {
    String name;//name of the hero 字符串类型
    float hp;
    float armor;
    int moveSpeed;
    float rate;//how often people use this hero

    void keng(){
        System.out.println("坑队友");
    }

    void speedUp(int speedAdd){
        moveSpeed = moveSpeed + speedAdd;
    }

    public void legendary(){
        System.out.println("Holy shit");
    }//无返回类型

    public float getHp(){
        return hp;
    }//有返回类型

    public void recovery(float blood){
        hp = hp + blood;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "garen";
        garen.hp = 515.28f;
        garen.moveSpeed = 39;

        Hero teemo = new Hero();
        teemo.name = "Teemo";
        teemo.hp = 389f;
        teemo.moveSpeed = 33;
        teemo.keng();
        teemo.speedUp(10);
        teemo.recovery(12f);
        System.out.println(teemo.moveSpeed);
        System.out.println(teemo.getHp());
        int i = 10;
        long j = 1000;
        char k = 'w';//字符型，只能存放一个字母 单引号
        float v1 = 122.33f;
        double d = 13.323;
        boolean b1 = true;
        boolean b2 = false;
        String str = "Hello world";
        double v2 = 23.4e5;
        System.out.println(v2);
        byte v3 = 5;
        final int k1 = 10; // can't be changed after
        v3 = (byte)k1;


    }
}
