package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MyStack implements Stack {
    LinkedList<Hero> heros = new LinkedList<Hero>();
    public void push(Hero h){
        heros.addLast(h);
    }

    public Hero pull(){
        return heros.removeLast();
    }

    public Hero peek(){
        return heros.getLast();
    }

    public static void main(String[] args) {
        MyStack herostack = new MyStack();
        List Hero = new ArrayList();
        for (int i = 0; i<5;i++){
            Hero h = new Hero("HeroName"+i);
            System.out.println("push hero:"+h);
            herostack.push(h);
        }
        for (int i = 0; i<5; i++){
            Hero h = herostack.pull();
            System.out.println("pull out the hero" + h);
        }
    }
}
