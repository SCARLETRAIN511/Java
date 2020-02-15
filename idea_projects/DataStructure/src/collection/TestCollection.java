package collection;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add(new Hero("Garen"));
        System.out.println(heros.size());
        heros.add(new Hero("Timo"));
        System.out.println(heros.toString());
        System.out.println(heros.get(1));
        System.out.println(heros.indexOf(new Hero("Timo")));

        ArrayList h1 = new ArrayList();
        create(h1);
        System.out.println(h1.indexOf(new Hero("hero2")));
    }
    public static void create(ArrayList h1){
        for (int i = 0; i < 5;i++){
            h1.add(new Hero("hero" + i));
        }
    }
}
