package collection;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add(new Hero("Garen"));
        System.out.println(heros.size());
        heros.add(new Hero("Timo"));
        System.out.println(heros.toString());
    }
}
