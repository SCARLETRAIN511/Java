package class01;

import java.nio.file.Watchable;

public class Weapon extends Item{//继承 Item 的属性
    int damage;

    public static void main(String[] args) {
        Weapon InfinityEdge = new Weapon();
        InfinityEdge.damage = 65;
        InfinityEdge.name = "无尽之刃";
        InfinityEdge.price = 999;
        System.out.println(InfinityEdge.price);

    }
}
