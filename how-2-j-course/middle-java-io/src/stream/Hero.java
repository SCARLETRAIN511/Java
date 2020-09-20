package stream;

import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
    public Hero(String name){
        this.name = name;
    }
}
